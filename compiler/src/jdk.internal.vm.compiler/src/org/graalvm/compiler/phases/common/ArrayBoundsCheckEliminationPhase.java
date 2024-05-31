/*
 * Copyright (c) 2011, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.compiler.phases.common;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;

import jdk.vm.ci.meta.PrimitiveConstant;
import org.graalvm.collections.EconomicMap;
import org.graalvm.collections.EconomicSet;
import org.graalvm.collections.Pair;
import org.graalvm.compiler.core.common.type.IntegerStamp;
import org.graalvm.compiler.debug.DebugContext;
import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.graph.NodeMap;
import org.graalvm.compiler.nodeinfo.Verbosity;
import org.graalvm.compiler.nodes.ConstantNode;
import org.graalvm.compiler.nodes.GraphState;
import org.graalvm.compiler.nodes.*;
import org.graalvm.compiler.nodes.StructuredGraph;
import org.graalvm.compiler.nodes.calc.AddNode;
import org.graalvm.compiler.nodes.calc.IntegerBelowNode;
import org.graalvm.compiler.nodes.calc.IntegerEqualsNode;
import org.graalvm.compiler.nodes.calc.IntegerLessThanNode;
import org.graalvm.compiler.nodes.cfg.ControlFlowGraph;
import org.graalvm.compiler.nodes.cfg.HIRBlock;
import org.graalvm.compiler.nodes.java.AccessArrayNode;
import org.graalvm.compiler.nodes.java.AccessIndexedNode;
import org.graalvm.compiler.nodes.java.ArrayLengthNode;
import org.graalvm.compiler.nodes.java.LoadIndexedNode;
import org.graalvm.compiler.options.Option;
import org.graalvm.compiler.options.OptionKey;
import org.graalvm.compiler.options.OptionType;
import org.graalvm.compiler.phases.Phase;

public class ArrayBoundsCheckEliminationPhase extends Phase {

    private static PrintStream out;

    public static class Options {
        // @formatter:off
        @Option(help = "Disable array bounds check elimination", type = OptionType.Debug)
        public static final OptionKey<Boolean> DisableABCE = new OptionKey<>(false);
        @Option(help = "Print debugging output for array bounds check elimination", type = OptionType.Debug)
        public static final OptionKey<Boolean> DebugABCE = new OptionKey<>(true);
        @Option(help = "UNSAFE ignoring of all bounds checks", type = OptionType.Debug)
        public static final OptionKey<Boolean> UnsafeABCE = new OptionKey<>(false);
        @Option(help = "Perform ABCE after loop phases", type = OptionType.Expert)
        public static final OptionKey<Boolean> PeeledABCE = new OptionKey<>(false);
        @Option(help = "Perform lowering in ABCE tests", type = OptionType.Debug)
        public static final OptionKey<Boolean> TestLoweringABCE = new OptionKey<>(false);
        // @formatter:on
    }

    public enum Optionality {
        Optional,
        Required;
    }

    @Override
    protected boolean shouldDumpBeforeAtBasicLevel() {
        return true;
    }

    @Override
    protected boolean shouldDumpAfterAtBasicLevel() {
        return true;
    }

    private ControlFlowGraph cfg;
    private final EconomicMap<Node, PiContext> piContextBeginningAfter = EconomicMap.<Node, PiContext>create();
    public final List<DemandProver> upperProvers = new ArrayList<>();
    public final List<DemandProver> lowerProvers = new ArrayList<>();

    @Override
    public Optional<NotApplicable> notApplicableTo(GraphState graphState) {
        return ALWAYS_APPLICABLE;
    }

    private PrimitiveConstant castConstantLong(Node node) {
        if (node instanceof ConstantNode c && c.getValue() instanceof PrimitiveConstant prim) {
            if (prim.getJavaKind().isNumericInteger())
                return prim;
        }
        return null;
    }

    @Override
    public void run(StructuredGraph graph) {
        try (DebugContext.Scope ignored = graph.getDebug().scope("ArrayBoundsCheckElimination", graph)) {
            if (Options.DisableABCE.getValue(graph.getOptions())) {
                return;
            }
            var debug = Options.DebugABCE.getValue(graph.getOptions());
            var unsafe = Options.UnsafeABCE.getValue(graph.getOptions());
            if (unsafe) {
                for (var node : graph.getNodes()) {
                    if (node instanceof AccessIndexedNode access) {
                        access.setRedundantUpperBound(true);
//                        access.setRedundantLowerBound(true);
                    }
                }
                return;
            }

            out = debug ? System.out : new PrintStream(OutputStream.nullOutputStream());
            var optlog = graph.getOptimizationLog();

            // just printing the cfg
            cfg = ControlFlowGraph.compute(graph, true, true, true, true);
            for (var bb : cfg.getBlocks()) {
                out.println(bb.toString(Verbosity.All));
                out.println("ended by: " + bb.getEndNode());
                for (var node : bb.getNodes())
                    out.println(node);
                out.println();
            }

            var zero = graph.addOrUnique(ConstantNode.forInt(0));
            var topContext = new PiContext(List.of(), cfg.getStartBlock().getBeginNode(), null);
//        addPiNodes(cfg.getStartBlock(), deque);

            var visitor = new AddPiNodesVisitor();
            visitor.addContext(topContext);
            var piContextActiveAt = new NodeMap<PiContext>(graph);
            cfg.visitDominatorTree(visitor, false);
            for (var ctx : visitor.allContexts) {
                piContextBeginningAfter.put(ctx.begin, ctx);
                for (var node : ctx.nodes) {
                    assert !piContextActiveAt.containsKey(node) : "duplicated key in piContextActiveAt: " + node + " 1:" + piContextActiveAt.get(node) + " 2:" + ctx;
                    piContextActiveAt.put(node, ctx);
                }
            }

//        ControlFlowGraph.RecursiveVisitor<?> visitor = createVisitor(graph, cfg, blockToNodes, nodeToBlock, context);
//        cfg.visitDominatorTree(visitor, graph.isBeforeStage(GraphState.StageFlag.VALUE_PROXY_REMOVAL));

            // a weighted directed graph, with (src, tgt) as keys.
            // (u,v) = c   <==>   v - u <= c  <==> c + u >= v
            // i.e., the weight bounds the numerical difference between the target and destination nodes.

            List<AccessIndexedNode> boundsChecks = new ArrayList<>();
            EconomicSet<ConstantNode> constants = EconomicSet.create();

            // graal ir does not explicitly assign to local variables. instead, we can pretend each SSA node is an assignment
            // to a variable called itself.
            for (Node node : graph.getNodes()) {
                // ignored:
                // vi = Aj.length
                // vi = c
                if (node instanceof ConstantNode constant) {
                    constants.add(constant);
                } else if (node instanceof AddNode add) {
                    long weight = -1;
                    PrimitiveConstant prim;
                    Node other = null;
                    if ((prim = castConstantLong(add.getX())) != null) {
                        weight = prim.asLong();
                        other = add.getY();
                    } else if ((prim = castConstantLong(add.getY())) != null) {
                        weight = prim.asLong();
                        other = add.getX();
                    }
                    if (other != null)
                        topContext.addEdge(EssaVar.pi(other), EssaVar.pi(node), weight);
                } else if (node instanceof IfNode ifnode) {
                    var tpi = piContextBeginningAfter.get(ifnode.trueSuccessor());
                    var fpi = piContextBeginningAfter.get(ifnode.falseSuccessor());
                    if (ifnode.condition() instanceof IntegerLessThanNode ltnode) {
                        // X < Y
                        var x = ltnode.getX();
                        var y = ltnode.getY();

                        // pi(X) < pi(Y)  <==> pi(X) - pi(Y) <= - 1
                        tpi.addEdge(EssaVar.pi(y), EssaVar.pi(x), -1L);

                        // pi(X) >= pi(Y)  <==> pi(Y) - pi(X) <= 0
                        fpi.addEdge(EssaVar.pi(x), EssaVar.pi(y), 0L);
                    } else if (ifnode.condition() instanceof IntegerBelowNode ltnode) {
                        // FIXME handle below (unsigned less than) and less than (signed LT) properly!!!
                        // X < Y
                        var x = ltnode.getX();
                        var y = ltnode.getY();
                        // pi variables inserted via {@link PiContext#piBases}

                        // pi(X) < pi(Y)  <==> pi(X) - pi(Y) <= - 1
                        tpi.addEdge(EssaVar.pi(y), EssaVar.pi(x), -1L);

                        // X >= Y  <==> pi(Y) - pi(X) <= 0
                        fpi.addEdge(EssaVar.pi(x), EssaVar.pi(y), 0L);
                    }

                } else if (node instanceof PhiNode phinode) {
                    for (var v : phinode.values()) {
                        topContext.addEdge(EssaVar.pi(v), EssaVar.pure(phinode), 0L);
                    }
                } else if (node instanceof AccessIndexedNode loadnode) {
                    var ctx = piContextBeginningAfter.get(loadnode);
                    var piIndex = EssaVar.pi(loadnode.index());
                    ctx.addEdge(new EssaVar.LengthNodeVar(loadnode.array()), piIndex, -1L);
                    ctx.addEdge(piIndex, EssaVar.pi(zero), 0L);
                    boundsChecks.add(loadnode);
                }

                out.println(node.getClass() + " " + node);
            }

            List<ConstantNode> constantsList = new ArrayList<>();
            constants.iterator().forEachRemaining(x -> {
                if (castConstantLong(x) != null) constantsList.add(x);
            });
            constantsList.sort(Comparator.comparing(x -> castConstantLong(x).asLong()));

            for (var i = 0; i < constantsList.size() - 1; i++) {
                var l = constantsList.get(i);
                var r = constantsList.get(i + 1);
                var lv = castConstantLong(l).asLong();
                var rv = castConstantLong(r).asLong();
//            topContext.overlay.put(Pair.create(EssaVar.pure(l), EssaVar.pure(r)), rv-lv);
                topContext.addEdge(EssaVar.pi(r), EssaVar.pi(l), lv - rv);
            }

            if (debug) out.println("PI CONTEXT: " + piContextBeginningAfter);
            int i = 2;
            for (var node : graph.getNodes()) {
                if (node instanceof AccessIndexedNode access) {
                    optlog.report(ArrayBoundsCheckEliminationPhase.class, "BoundsCheck", access);

                    // begin eliminating bounds checks
                    List<PiContext> piContextsInScope = new ArrayList<>();
                    for (var ctx = piContextActiveAt.get(access); ctx != null; ctx = ctx.parent)
                      piContextsInScope.add(ctx);

                    DemandProver prover;
                    DemandProver.Lattice result;
                    prover = new DemandProver(access, piContextsInScope, true);
                    result = prover.prove();
                    if (result != DemandProver.Lattice.False) {
                        access.setRedundantUpperBound(true);
                    }

//            var lowerProver = prover = new DemandProver(indexed, piContextsInScope, false);
//            lowerProvers.add(prover);
//            result = prover.prove();
//            out.println("lower: " + result);
//            if (result != DemandProver.Lattice.False) indexed.setRedundantLowerBound(true);

                    out.printf("DOT%d! digraph G {%n", i);
                    for (var it = prover.piEssa.getEntries(); it.advance(); ) {
                        out.printf("DOT%d! \"%s\" -> \"%s\" [ label=\"%d\" ];%n", i, it.getKey().getLeft(), it.getKey().getRight(), it.getValue());
                    }
                    out.printf("DOT%d! }%n", i);
                    i++;
                }
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static class PiContext {
        /** Parent pi context. */
        final PiContext parent;
        /** Node where this pi context begins, exclusive! */
        final FixedNode begin;
        /** Set of nodes where this context is the innermost context. */
        final EconomicSet<FixedNode> nodes = EconomicSet.create();
        /** Inequalities added within this pi context. */
        final EconomicMap<Pair<EssaVar, EssaVar>, Long> overlay = EconomicMap.create();
        /** Graal nodes to be wrapped in pi while in this context. */
        final List<Node> piBases;

        private PiContext(List<Node> piBases, FixedNode begin, PiContext parent) {
            this.piBases = piBases;
            this.parent = parent;
            this.begin = begin;
        }

        /**
         * Adds an inequality edge representing "tgt - src <= weight" or "tgt <= weight + src".
         */
        public void addEdge(EssaVar src, EssaVar tgt, long weight) {
            var key = Pair.create(src, tgt);
            var old = overlay.get(key);
            // for both upper- and lower-bounds, taking the smaller weight gives us a more powerful constraint.
            var newWeight = old != null ? Long.min(old, weight) : weight;
            if (old == null || old != newWeight) {
                overlay.put(key, newWeight);
            }
        }

        /**
         * Like {@link #addEdge(EssaVar, EssaVar, long)}, but additionally marks the edge as symmetric.
         * That is, the inequality described by this edge actually holds as an equality.
         * When considering lower bounds, such edges are reversed.
         */

        public Iterable<PiContext> parentIterator() {
            var that = this;
            return () -> new Iterator<>() {
                private PiContext ctx = that;
                @Override public boolean hasNext() { return ctx != null; }

                @Override
                public PiContext next() {
                    var ret = ctx;
                    ctx = ctx.parent;
                    return ret;
                }
            };
        }
    }

    private static class AddPiNodesVisitor implements ControlFlowGraph.RecursiveVisitor<Integer> {
        public final List<PiContext> allContexts = new ArrayList<>();
        private final Deque<PiContext> contextStack = new ArrayDeque<>();

        public int addContext(PiContext pi) {
            contextStack.push(pi);
            allContexts.add(pi);
            return 1;
        }

        @Override
        public Integer enter(HIRBlock b) {
//            for (var c : contextStack) {
//                c.fullBlocks.add(b);
//            }

            int numContexts = 0;
            if (b.getBeginNode().predecessor() instanceof IfNode ifnode && ifnode.condition() instanceof BinaryOpLogicNode binop) {
                out.println("enter: IF " + b);
                numContexts += addContext(new PiContext(List.of(binop.getX(), binop.getY()), b.getBeginNode(), contextStack.getFirst()));
            }

            for (var node : b.getNodes()) {
                contextStack.getFirst().nodes.add(node);
                if (node instanceof final AccessIndexedNode load) {
                    numContexts += addContext(new PiContext(List.of(load.index()), load, contextStack.getFirst()));
                }
            }

            return numContexts;
        }

        @Override
        public void exit(HIRBlock b, Integer count) {
            out.println("exit: " + b);
            for (var i = 0; i < count; i++) contextStack.pop();
        }
    }

    public sealed interface EssaVar {
        record Pi(EssaVar v) implements EssaVar {
            @Override public Node base() { return v.base(); }
        }
        record NodeVar(Node n) implements EssaVar {
            @Override public Node base() { return n; }
        }
        record LengthNodeVar(ValueNode n) implements EssaVar {
            @Override public Node base() { return n; }
        }

        Node base();

        static EssaVar pi(Node n) {
            return pi(pure(n));
        }
        static EssaVar pi(EssaVar n) {
//            if (n.base() instanceof ConstantNode) return n;
            return new Pi(n);
        }
        static NodeVar pure(Node n) {
            return new NodeVar(n);
        }
    }

    public static class DemandProver {

        /** inequality graph, represented as map of edges to weight. */
        private final EconomicMap<Pair<EssaVar, EssaVar>, Long> piEssa;

        private final EconomicMap<Pair<EssaVar, EssaVar>, TreeMap<Long, Lattice>> C = EconomicMap.create();

        private final EconomicMap<EssaVar, Long> active = EconomicMap.create();
        /** map of Graal nodes to their ESSA var, possibly adding pi nodes. */
        private final EconomicMap<Node, EssaVar> piMap = EconomicMap.create();
        public final AccessIndexedNode load;
        private final EssaVar source;
        private final EssaVar target;
        private final long weight;
        private int depth = 0;

        public enum Lattice {
            False,
            Reduced,
            True
        }

        // smaller
        public static Lattice meet(Lattice x, Lattice y) {
            if (x == Lattice.False || y == Lattice.False) return Lattice.False;
            if (x == Lattice.Reduced || y == Lattice.Reduced) return Lattice.Reduced;
            return Lattice.True;
        }

        // bigger
        public static Lattice join(Lattice x, Lattice y) {
            if (x == Lattice.True || y == Lattice.True) return Lattice.True;
            if (x == Lattice.Reduced || y == Lattice.Reduced) return Lattice.Reduced;
            return Lattice.False;
        }

        // XXX: good for one demand-prove only!
        DemandProver(AccessIndexedNode load, Iterable<PiContext> piContexts, boolean isUpperBound) {
            this.load = load;
            this.isUpperBound = isUpperBound;
            this.piEssa = EconomicMap.create();

            // index - len <= -1
            source = new EssaVar.LengthNodeVar(load.array());
            target = EssaVar.pi(load.index());
            weight = -1L;

            createPiEssa(piContexts);
        }

        /**
         * Returns a possibly-Pi version of the given Graal IR node, depending on its position within the active pi contexts.
         * May return zero or more layers of Pi.
         */
        public EssaVar resolveNode(Node n) {
            var pi = piMap.get(n);
            return pi != null ? pi : EssaVar.pure(n);
        }

        /**
         * Used internally to convert EssaVar from overlays (which have at most one Pi level), to EssaVar for this
         * prover instance which might have nested Pi. Specifically, Pis are converted with resolveNode().
         * Other variants are unchanged.
         */
        private EssaVar resolveEssaVar(EssaVar v) {
            // late-stage canonicalisation of array length nodes.
            if (v.base() instanceof ArrayLengthNode len) {
                return new EssaVar.LengthNodeVar(len.array());
            }
            if (v instanceof EssaVar.Pi pi) {
                assert pi.equals(EssaVar.pi(pi.base())) : "must have exactly one pi level";
                return resolveNode(pi.base());
            }
            return v;
        }

        private static <T, U> Pair<U,U> both(Function<T,U> f, Pair<T,T> pair) {
            return Pair.create(f.apply(pair.getLeft()), f.apply(pair.getRight()));
        }

        public void createPiEssa(Iterable<PiContext> piContexts) {
            assert piEssa.isEmpty();

            for (var context : piContexts) {
                out.println("adding PiContext: " + context);
                // add virtual pi nodes.
                for (var base : context.piBases) {
                    var baseVar = resolveNode(base);
                    var piNew = EssaVar.pi(baseVar);
                    var key = Pair.create(baseVar, piNew);
                    piEssa.put(key, 0L);
                    piMap.put(base, piNew);
                }
            }
            for (var context : piContexts) {
                for (var it = context.overlay.getEntries(); it.advance(); ) {
                    var key = it.getKey();
                    piEssa.put(both(this::resolveEssaVar, key), it.getValue());
                }
            }
        }

        /**
         * attempts to prove an edge from array length node to the given index node.
         * if proven, this will bound "index < array length" and hence this array index needs no bounds check.
         */
        public Lattice prove() {
            depth = 1;
            return prove(resolveEssaVar(target), weight);
        }

        private Lattice prove(EssaVar v, long c) {
            if (v.base() instanceof ArrayLengthNode len) {
                v = new EssaVar.LengthNodeVar(len.array());
            }
            var startindent = depth > 0 ? "|".repeat(depth-1) + "/" : "";
            var finishindent = depth > 0 ? "|".repeat(depth-1) + "\\" : "";
            var indent = "|".repeat(depth);
            out.printf("%sprove: -> %s (i.e. len - (%s) <= %d)%n", startindent, v, v, c);
            depth++;
            var result = prove(v, c, indent);
            depth--;
            out.printf("%s= %s%n", finishindent, result);
            return result;
        }

        private Lattice prove(EssaVar v, long c, String indent) {
            var ckey = Pair.create(source, v);
            if (C.get(ckey) == null)
                C.put(ckey, new TreeMap<>());
            var cmap = C.get(ckey);

            for (var proven : cmap.entrySet()) {
                var e = proven.getKey();
                var ret = proven.getValue();
                // same or stronger difference was already proven
                if (e <= c && ret == Lattice.True) {
                    out.printf("%s  by already proven stronger difference,%n", indent);
                    return Lattice.True;
                }
                // same or weaker difference was already disproved
                if (e >= c && ret == Lattice.False) {
                    out.printf("%s  by already disproven weaker difference,%n", indent);
                    return Lattice.False;
                }
                // v is on a cycle that was reduced for same or stronger difference
                if (e <= c && ret == Lattice.Reduced) {
                    out.printf("%s  by already reduced stronger difference,%n", indent);
                    return Lattice.Reduced;
                }
            }
            // traversal reached the source vertex, success if a - a <= c
            if (source.base().equals(v.base()) && c >= 0) {
                out.printf("%s  by base case,%n", indent);
                return Lattice.True;
            }

            // if no constraint exist on the value of v, we fail
            // recall: edge u -c-> v constrains v by v - u <= c.
            boolean has = false;
            for (var it = piEssa.getEntries(); it.advance(); ) {
                if (it.getKey().getRight().equals(v)) {
                    has = true;
                    break;
                }
            }
            if (!has) {
                out.printf("%s  by no incoming constraints,%n", indent);
                return Lattice.False;
            }

            // a cycle at v
            if (active.containsKey(v)) {
                // an amplifying cycle which can become arbitrarily large
                /* TODO bug in paper???
                    paper had >, but this seems backwards.
                    a new c value which is smaller indicates a request to prove a stronger statement, i.e. the variable is incrementing.
                    empirically, the results match with this interpretation.
                 */
                if (isUpperBound ? c <= active.get(v) : c >= active.get(v)) {
                    out.printf("%s  by amplifying cycle,%n", indent);
                    return Lattice.False;
                } else {
                    // harmless cycle
                    out.printf("%s  by harmless cycle,%n", indent);
                    return Lattice.Reduced;
                }
            }
            active.put(v, c);
            out.printf("%s... parents of %s%n", indent, v);
            if (v instanceof EssaVar.NodeVar nodevar && nodevar.n instanceof PhiNode) {
                for (var it = piEssa.getEntries(); it.advance(); ) {
                    if (!it.getKey().getRight().equals(v)) continue;
                    var u = it.getKey().getLeft();
                    var d = it.getValue();
                    var prev = Objects.requireNonNullElse(cmap.get(c), Lattice.True);
                    cmap.put(c, meet(prev, prove(u, c - d)));
                }
            } else {
                for (var it = piEssa.getEntries(); it.advance(); ) {
                    if (!it.getKey().getRight().equals(v)) continue;
                    var u = it.getKey().getLeft();
                    var d = it.getValue();
                    var prev = Objects.requireNonNullElse(cmap.get(c), Lattice.False);
                    cmap.put(c, join(prev, prove(u, c - d)));
                }
            }
            active.removeKey(v);
            return cmap.get(c);
        }
    }
}
