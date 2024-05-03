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
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
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
import org.graalvm.compiler.nodes.java.AccessIndexedNode;
import org.graalvm.compiler.nodes.java.ArrayLengthNode;
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
    private final EconomicMap<Node, PiContext> piContexts = EconomicMap.create();
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

            out = Options.DebugABCE.getValue(graph.getOptions()) ? System.out : new PrintStream(OutputStream.nullOutputStream());
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
            final ArrayDeque<PiContext> deque = new ArrayDeque<>();
            var topContext = new PiContext(List.of(), cfg.getStartBlock().getBeginNode(), cfg.getStartBlock());
            topContext.fullBlocks.addAll(Arrays.asList(cfg.getBlocks()));
            deque.push(topContext);
//        addPiNodes(cfg.getStartBlock(), deque);

            var visitor = new AddPiNodesVisitor();
            cfg.visitDominatorTree(visitor, false);
            for (var ctx : visitor.allContexts) {
                piContexts.put(ctx.begin, ctx);
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
                        topContext.addSymmetricEdge(EssaVar.pi(other), EssaVar.pi(node), weight);
                } else if (node instanceof IfNode ifnode) {
                    var tpi = piContexts.get(ifnode.trueSuccessor());
                    var fpi = piContexts.get(ifnode.falseSuccessor());
                    if (ifnode.condition() instanceof IntegerEqualsNode eqnode) {
                        var x = eqnode.getX(); // variable?
                        var y = eqnode.getY(); // constant?
                        tpi.addEdge(EssaVar.pi(y), EssaVar.pi(x), 0L);
                        if (x.stamp(NodeView.DEFAULT) instanceof IntegerStamp intstamp && intstamp.isPositive()) {
                            // System.out.println("FJAIOFJDAIOFJIADO");
//                            var incrementY = graph.addOrUniqueWithInputs(AddNode.create(y, ConstantNode.forInt(1), NodeView.DEFAULT));
                            fpi.addEdge(EssaVar.pi(x), EssaVar.pi(y), -1L);
                        }
                    } else if (ifnode.condition() instanceof IntegerLessThanNode ltnode) {
                        // X < Y
                        var x = ltnode.getX();
                        var y = ltnode.getY();
                        // pi variables inserted via {@link PiContext#piBases}

                        // pi(X) < pi(Y)  <==> pi(X) - pi(Y) <= - 1
                        tpi.addEdge(EssaVar.pi(y), EssaVar.pi(x), -1L);

                        // X >= Y  <==> pi(Y) - pi(X) <= 0
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
                        topContext.addSymmetricEdge(EssaVar.pi(v), EssaVar.pure(phinode), 0L);
                    }
                } else if (node instanceof AccessIndexedNode loadnode) {
                    var ctx = piContexts.get(loadnode);
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

            out.println("PI CONTEXT: " + piContexts);
            int i = 2;
            for (var boundsCheck : boundsChecks) {
                optlog.report(ArrayBoundsCheckEliminationPhase.class, "BoundsCheck", boundsCheck);

                // begin eliminating bounds checks
                var theblock = cfg.getNodeToBlock().get(boundsCheck);
                var lengthnode = new EssaVar.LengthNodeVar(boundsCheck.array());
                var indexnode = boundsCheck.index();
                List<PiContext> piContextsInScope = new ArrayList<>();
                piContextsInScope.add(topContext);
                for (var it = piContexts.getEntries(); it.advance(); ) {
                    var ctx = it.getValue();
                    if (ctx.fullBlocks.contains(theblock) || ctx.beginNodes.contains(boundsCheck)) {
                        piContextsInScope.add(ctx);
                        out.println(ctx.beginNodes);
                    }
                }

                DemandProver prover;
                DemandProver.Lattice result;
                out.println("preparing to eliminate check for " + boundsCheck);
                prover = new DemandProver(boundsCheck, piContextsInScope, true);
                upperProvers.add(prover);
                result = prover.prove();
                out.println("upper: " + result);
                if (result != DemandProver.Lattice.False) {
                    optlog.report(ArrayBoundsCheckEliminationPhase.class, "BoundsCheckUpperRedundant", boundsCheck);
                    boundsCheck.setRedundantUpperBound(true);
                } else {
                    optlog.report(ArrayBoundsCheckEliminationPhase.class, "BoundsCheckUpperNonredundant", boundsCheck);
                }

//            var lowerProver = prover = new DemandProver(boundsCheck, piContextsInScope, false);
//            lowerProvers.add(prover);
//            result = prover.prove();
//            out.println("lower: " + result);
//            if (result != DemandProver.Lattice.False) boundsCheck.setRedundantLowerBound(true);

                out.printf("DOT%d! digraph G {%n", i);
                for (var it = prover.piEssa.getEntries(); it.advance(); ) {
                    out.printf("DOT%d! \"%s\" -> \"%s\" [ label=\"%d\" ];%n", i, it.getKey().getLeft(), it.getKey().getRight(), it.getValue());
                }
                out.printf("DOT%d! }%n", i);
                i++;
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static class PiContext {
        public final EconomicMap<Pair<EssaVar, EssaVar>, Long> overlay = EconomicMap.create();
        public final EconomicSet<Pair<EssaVar, EssaVar>> symmetric = EconomicSet.create();
        // a mapping of array nodes to their length nodes. used when constructing pi nodes after array-accesses.
        public final NodeMap<ArrayLengthNode> lengthNodes;
        public final FixedNode begin; // exclusive!

        /** set of nodes in the begin block which are affected by this context. */
        public final EconomicSet<FixedNode> beginNodes = EconomicSet.create();
        /** set of blocks which are fully-affected by this context. */
        public final EconomicSet<HIRBlock> fullBlocks = EconomicSet.create();
        public final List<Node> piBases;

        private PiContext(Node piBase, FixedNode begin, HIRBlock beginBlock) {
            this(List.of(piBase), begin, beginBlock);
        }

        private PiContext(List<Node> piBases, FixedNode begin, HIRBlock beginBlock) {
            this.piBases = piBases;
            this.begin = begin;
            this.lengthNodes = new NodeMap<>(begin.graph());

            var it = beginBlock.getNodes().iterator();
            while (it.hasNext() && !it.next().equals(begin));
            while (it.hasNext()) beginNodes.add(it.next());
        }

        @Override
        public String toString() {
            return String.format("PiContext(begin=%s, nodes=%s, blocks=%s)", begin, beginNodes, fullBlocks);
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
        public void addSymmetricEdge(EssaVar src, EssaVar tgt, long weight) {
            addEdge(src, tgt, weight);
            symmetric.add(Pair.create(src, tgt));
        }
    }

    private static class AddPiNodesVisitor implements ControlFlowGraph.RecursiveVisitor<Integer> {
        public final List<PiContext> allContexts = new ArrayList<>();
        private final Deque<PiContext> contextStack = new ArrayDeque<>();

        private int addContext(PiContext pi) {
            contextStack.push(pi);
            allContexts.add(pi);
            return 1;
        }

        @Override
        public Integer enter(HIRBlock b) {
            for (var c : contextStack) {
                c.fullBlocks.add(b);
            }

            int numContexts = 0;
            if (b.getBeginNode().predecessor() instanceof IfNode ifnode && ifnode.condition() instanceof BinaryOpLogicNode binop) {
                out.println("enter: IF " + b);
                numContexts += addContext(new PiContext(List.of(binop.getX(), binop.getY()), b.getBeginNode(), b));
            }

            for (var node : b.getNodes()) {
                if (node instanceof final AccessIndexedNode load) {
                    numContexts += addContext(new PiContext(load.index(), load, b));
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

        private final boolean isUpperBound;
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
            if (isUpperBound) {
                // index - len <= -1
                source = new EssaVar.LengthNodeVar(load.array());
                target = EssaVar.pi(load.index());
                weight = -1L;
            } else {
                // 0 - index <= 0
                source = EssaVar.pi(load.index());
                target = EssaVar.pi(load.graph().addOrUnique(ConstantNode.forInt(0)));
                weight = 0L;
            }
            out.println("\nDemandProver init: source=" + source + ", target=" + target);
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
         * prover instance which might have nested Pi. Specifically, Pis are converted with maybePi().
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

        private static <T> Pair<T,T> swap(Pair<T,T> pair) {
            return Pair.create(pair.getRight(), pair.getLeft());
        }

        public void createPiEssa(Iterable<PiContext> piContexts) {
            assert piEssa.isEmpty();

            for (var context : piContexts) {
                out.println("adding PiContext: " + context);
                // add virtual pi nodes.
                for (var base : context.piBases) {
                    var baseVar = resolveNode(base);
                    var piNew = EssaVar.pi(baseVar);
                    out.printf("adding pi: pi %s = %s%n", base, piNew);
                    var key = Pair.create(baseVar, piNew);
                    if (!isUpperBound) key = swap(key);
                    piEssa.put(key, 0L);
                    piMap.put(base, piNew);
                }
            }
            for (var context : piContexts) {
                for (var it = context.overlay.getEntries(); it.advance(); ) {
                    var key = it.getKey();
                    if (!isUpperBound && context.symmetric.contains(key)) key = swap(key);
                    piEssa.put(both(this::resolveEssaVar, key), it.getValue());
                    out.printf("adding overlay: %s, %s%n", key, it.getValue());
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
                    var ok = isUpperBound
                            ? it.getKey().getRight().equals(v)
                            : it.getKey().getLeft().equals(v);
                    if (!ok) continue;
//                    if (!it.getKey().getRight().equals(v)) continue;
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
