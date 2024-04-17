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

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.graph.NodeFlood;
import org.graalvm.compiler.graph.NodeMap;
import org.graalvm.compiler.nodeinfo.Verbosity;
import org.graalvm.compiler.nodes.AbstractEndNode;
import org.graalvm.compiler.nodes.ConstantNode;
import org.graalvm.compiler.nodes.GraphState;
import org.graalvm.compiler.nodes.GuardNode;
import org.graalvm.compiler.nodes.*;
import org.graalvm.compiler.nodes.StructuredGraph;
import org.graalvm.compiler.nodes.calc.AddNode;
import org.graalvm.compiler.nodes.calc.IntegerBelowNode;
import org.graalvm.compiler.nodes.calc.IntegerLessThanNode;
import org.graalvm.compiler.nodes.cfg.ControlFlowGraph;
import org.graalvm.compiler.nodes.cfg.HIRBlock;
import org.graalvm.compiler.nodes.java.ArrayLengthNode;
import org.graalvm.compiler.nodes.java.LoadIndexedNode;
import org.graalvm.compiler.options.Option;
import org.graalvm.compiler.options.OptionKey;
import org.graalvm.compiler.options.OptionType;
import org.graalvm.compiler.phases.Phase;

public class ArrayBoundsCheckEliminationPhase extends Phase {

    public static class Options {

        // @formatter:off
        @Option(help = "Disable array bounds check elimations", type = OptionType.Debug)
        public static final OptionKey<Boolean> DisableABCE = new OptionKey<>(true);
        // @formatter:on
    }

    public enum Optionality {
        Optional,
        Required;
    }

    /**
     * Creates a dead code elimination phase that will be run irrespective of
     * {link Options#ReduceDCE}.
     */
    public ArrayBoundsCheckEliminationPhase() {
        this(Optionality.Required);
    }

    @Override
    protected boolean shouldDumpBeforeAtBasicLevel() {
        return true;
    }

    @Override
    protected boolean shouldDumpAfterAtBasicLevel() {
        return true;
    }

    /**
     * Creates a dead code elimination phase that will be run only if it is
     * {@linkplain Optionality#Required non-optional} or {link Options#ReduceDCE} is false.
     */
    public ArrayBoundsCheckEliminationPhase(Optionality optionality) {
        this.optional = optionality == Optionality.Optional;
    }

    private final boolean optional;
    private final boolean disabled = false;

    private ControlFlowGraph cfg;
    private final EconomicMap<Node, PiContext> piContexts = EconomicMap.create();
    public final List<DemandProver> provers = new ArrayList<>();

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
        if (disabled || optional && Options.DisableABCE.getValue(graph.getOptions())) {
            return;
        }

        // just printing the cfg
        cfg = ControlFlowGraph.compute(graph, true, true, true, true);
        for (var bb : cfg.getBlocks()) {
            System.out.println(bb.toString(Verbosity.All));
            System.out.println("ended by: " + bb.getEndNode());
            for (var node : bb.getNodes())
                System.out.println(node);
            System.out.println();
        }

        final ArrayDeque<PiContext> deque = new ArrayDeque<>();
        var topContext = new PiContext(List.of(), cfg.getStartBlock().getBeginNode(), cfg.getStartBlock());
        topContext.fullBlocks.addAll(Arrays.asList(cfg.getBlocks()));
        deque.push(topContext);
        var end = addPiNodes(cfg.getStartBlock(), deque);

//        ControlFlowGraph.RecursiveVisitor<?> visitor = createVisitor(graph, cfg, blockToNodes, nodeToBlock, context);
//        cfg.visitDominatorTree(visitor, graph.isBeforeStage(GraphState.StageFlag.VALUE_PROXY_REMOVAL));

        // a weighted directed graph, with (src, tgt) as keys.
        // (u,v) = c   <==>   v - u <= c  <==> c + u >= v
        // i.e., the weight bounds the numerical difference between the target and destination nodes.

        List<LoadIndexedNode> boundsChecks = new ArrayList<>();
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
                    topContext.overlay.put(Pair.create(EssaVar.pi(other), EssaVar.pi(node)), weight);
            } else if (node instanceof IfNode ifnode) {
                var tpi = piContexts.get(ifnode.trueSuccessor());
                var fpi = piContexts.get(ifnode.falseSuccessor());
                if (ifnode.condition() instanceof IntegerLessThanNode ltnode) {
                    // X < Y
                    var x = ltnode.getX();
                    var y = ltnode.getY();
                    // pi variables inserted via {@link PiContext#piBases}

                    // pi(X) < pi(Y)  <==> pi(X) - pi(Y) <= - 1
                    tpi.overlay.put(Pair.create(EssaVar.pi(y), EssaVar.pi(x)), -1L);

                    // X >= Y  <==> pi(Y) - pi(X) <= 0
                    fpi.overlay.put(Pair.create(EssaVar.pi(x), EssaVar.pi(y)), 0L);
                } else if (ifnode.condition() instanceof IntegerBelowNode ltnode) {
                    // FIXME handle below (unsigned less than) and less than (signed LT) properly!!!
                    // X < Y
                    var x = ltnode.getX();
                    var y = ltnode.getY();
                    // pi variables inserted via {@link PiContext#piBases}

                    // pi(X) < pi(Y)  <==> pi(X) - pi(Y) <= - 1
                    tpi.overlay.put(Pair.create(EssaVar.pi(y), EssaVar.pi(x)), -1L);

                    // X >= Y  <==> pi(Y) - pi(X) <= 0
                    fpi.overlay.put(Pair.create(EssaVar.pi(x), EssaVar.pi(y)), 0L);
                }

            } else if (node instanceof PhiNode phinode) {
                for (var v : phinode.values()) {
                    topContext.overlay.put(Pair.create(EssaVar.pi(v), EssaVar.pure(phinode)), 0L);
                }
            } else if (node instanceof LoadIndexedNode loadnode) {
                piContexts.get(loadnode).overlay.put(
                        Pair.create(new EssaVar.LengthNodeVar(loadnode.array()), EssaVar.pi(loadnode.index())), -1L
                );
                boundsChecks.add(loadnode);
            }

            System.out.println(node.getClass() + " " +  node);
        }

        List<ConstantNode> constantsList = new ArrayList<>();
        constants.iterator().forEachRemaining(x -> {
            if (castConstantLong(x) != null) constantsList.add(x);
        });
        constantsList.sort(Comparator.comparing(x -> castConstantLong(x).asLong()));

        for (var i = 0; i < constantsList.size() - 1; i++) {
            var l = constantsList.get(i);
            var r = constantsList.get(i+1);
            var lv = castConstantLong(l).asLong();
            var rv = castConstantLong(r).asLong();
//            topContext.overlay.put(Pair.create(EssaVar.pure(l), EssaVar.pure(r)), rv-lv);
            topContext.overlay.put(Pair.create(EssaVar.pi(r), EssaVar.pi(l)), lv-rv);
        }

        System.out.println("PI CONTEXT: " + piContexts);
        int i = 2;
        for (var boundsCheck : boundsChecks) {
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
                    System.out.println(ctx.beginNodes);
                }
            }

            System.out.println("preparing to eliminate check for " + boundsCheck);
            var prover = new DemandProver(lengthnode, boundsCheck, piContextsInScope);
            provers.add(prover);
            System.out.println(prover.prove(indexnode, -1L));

            System.out.printf("DOT%d! digraph G {%n", i);
            for (var it = prover.piEssa.getEntries(); it.advance(); ) {
                System.out.printf("DOT%d! \"%s\" -> \"%s\" [ label=\"%d\" ];%n", i, it.getKey().getLeft(), it.getKey().getRight(), it.getValue());
            }
            System.out.printf("DOT%d! }%n", i);
            i++;
        }
    }

    static class PiContext {
        public final EconomicMap<Pair<EssaVar, EssaVar>, Long> overlay = EconomicMap.create();
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
    }

    /**
     * Performs a dominator-first visit of the CFG blocks. This function is called recursive, and each recursive call
     * should return when it reaches the end of its "if" branch scope.
     * @param replacements PiContext which are in effect for the given block. This may be modified partway through a block,
     *                     for example with Pi nodes from array loads.
     */
    private AbstractMergeNode addPiNodes(HIRBlock block, final Deque<PiContext> replacements) {
        // this will perform a top-down visit of the control flow tree, inserting pi nodes at branches.
        // XXX limitation: we only pi-ify precisely the operands to the < condition.
        // hopefully, the graph algorithm handles this transitively.
        // XXX also, only when they are literally used as inputs to cfg nodes in the branches.

//        cfg.visitDominatorTree(new Visitor(), true);

        assert block != null;

        if (block.getBeginNode() instanceof LoopExitNode exitnode) {
            // multiple-exit loops are handled at the loop begin node, do not recurse.
            if (exitnode.loopBegin().loopExits().count() > 1)
                return null;
        }

        // mark this block in all currently active pi contexts.
        for (var ctx : replacements) {
            System.out.println("arraylengths: " + ctx + " " + ctx.lengthNodes);
            ctx.fullBlocks.add(block);
        }

        var graph = block.getBeginNode().graph();


        System.out.println("addPiNodes: " + block);
        for (var node : block.getNodes()) {

            final var lastLengthNodes = replacements.getLast().lengthNodes;
            if (node instanceof ArrayLengthNode length) {
                lastLengthNodes.put(length.array(), length);
            }

            if (node instanceof final LoadIndexedNode load) {
                ArrayLengthNode length = null;
                for (final var ctx : replacements)
                    length = length != null ? length : ctx.lengthNodes.get(load.array());

                var context = new PiContext(load.index(), load, block);
                piContexts.put(context.begin, context);
                replacements.push(context);
            }
        }

        var endnode = block.getEndNode();
        var nodetoblock = cfg.getNodeToBlock();
        if (endnode instanceof IfNode ifnode) {
            var cond = ifnode.condition();

            AbstractMergeNode merge1, merge2;

            AbstractBeginNode truesucc = ifnode.trueSuccessor();
            AbstractBeginNode falsesucc = ifnode.falseSuccessor();
            if (cond instanceof BinaryOpLogicNode binnode) {
                System.out.println("recursing into if branches... " + ifnode);
                var x = binnode.getX();
                var y = binnode.getY();

                PiContext pi;
                AbstractMergeNode tend, fend;

                HIRBlock beginBlock1 = nodetoblock.get(truesucc);
                pi = new PiContext(List.of(x, y), truesucc, beginBlock1);
                replacements.push(pi);
                System.out.println(" begin tcase: " + truesucc);
                piContexts.put(pi.begin, pi);
                tend = addPiNodes(nodetoblock.get(truesucc), replacements);
                System.out.println(" end tcase: " + truesucc);
                pi = replacements.pop();
                while (!pi.begin.equals(truesucc)) pi = replacements.pop();
                System.out.println("piContexts: " + pi.begin + " --> " + pi);
                // pop multiple contexts since array accesses may have inserted pi variables too.

                HIRBlock beginBlock = nodetoblock.get(falsesucc);
                pi = new PiContext(List.of(x, y), falsesucc, beginBlock);
                replacements.push(pi);
                System.out.println(" begin fcase: " + falsesucc);
                piContexts.put(pi.begin, pi);
                fend = addPiNodes(nodetoblock.get(falsesucc), replacements);
                System.out.println(" end fcase: " + falsesucc);
                pi = replacements.pop();
                while (!pi.begin.equals(falsesucc)) pi = replacements.pop();
                System.out.println("piContexts: " + pi.begin + " --> " + pi);

                merge1 = tend;
                merge2 = fend;
            } else {
                System.out.println("unknown if condition: " + cond.toString());

                // no extra replacements down paths with unsupported conditions.
                piContexts.put(truesucc, new PiContext(List.of(), truesucc, nodetoblock.get(truesucc)));
                var tend = addPiNodes(nodetoblock.get(truesucc), replacements);
                piContexts.put(falsesucc, new PiContext(List.of(), falsesucc, nodetoblock.get(falsesucc)));
                var fend = addPiNodes(nodetoblock.get(falsesucc), replacements);


                merge1 = tend;
                merge2 = fend;
            }
//            assert Objects.equals(merge1, merge2) : "differing merge results from " + ifnode + " : " + merge1 + " | " + merge2;

            if (merge1 != null) {
                addPiNodes(nodetoblock.get(merge1), replacements);
            }
            if (merge2 != null && !Objects.equals(merge1, merge2)) {
                addPiNodes(nodetoblock.get(merge2), replacements);
            }
            return null;

        } else if (endnode instanceof LoopEndNode) {
            // a loop end is the end of a loop's inner block. both cases are considered at the loop entry, do not recurse.
            return null;

        } else if (endnode instanceof ReturnNode) {
            return null;

        } else if (endnode instanceof EndNode end && end.merge() != null) {
            if (end.merge() instanceof LoopBeginNode loopbegin) {
                System.out.println("handling loop: " + loopbegin);
                AbstractMergeNode merge = null;
                for (var x : loopbegin.cfgSuccessors()) {
                    System.out.println(" ... loop cfg succ: " + x);
                    addPiNodes(nodetoblock.get(x), replacements);
                }
                if (loopbegin.loopExits().count() == 1) {
                    System.out.println(" ... sole loop exit: " + loopbegin.loopExits().first());
                    // only one exit. no merge, so proceed to block after loop.
                    return addPiNodes(nodetoblock.get(loopbegin.loopExits().first()), replacements);
                }
                // multiple loop exits. ensure they all merge to the same point then visit their merge block.
                for (var x : loopbegin.loopExits()) {
                    System.out.println(" ... loop exit: " + x);
                    // assert that loop exit blocks are immediately merged. if so, return their common merge point.
                    var b = nodetoblock.get(x);
                    assert b.getEndNode().predecessor().equals(b.getBeginNode()) : "loop has non-trivial exit merge at " + b.getBeginNode();
                    var m = ((AbstractEndNode) b.getEndNode()).merge();
                    merge = merge == null ? m : merge;
                    assert Objects.equals(merge, m) : "loop exit merges differ! at " + loopbegin;
                }
                return addPiNodes(nodetoblock.get(merge), replacements);
            } else {
                // at a merge point which is not a loop head. this is probably an if node join?
                // return control to caller and do not recurse.
                return end.merge();
            }
        } else {
            assert block.getSuccessorCount() == 1 : "num successors != 1 at: " + block;
            System.out.println("fallthrough pi endnode: " + endnode);
            return addPiNodes(block.getFirstSuccessor(), replacements);
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

        private final EconomicMap<Pair<EssaVar, EssaVar>, Long> piEssa;
        private final EssaVar.LengthNodeVar a;
        private final EconomicMap<Pair<EssaVar.LengthNodeVar, EssaVar>, TreeMap<Long, Lattice>> C = EconomicMap.create();
        private final EconomicMap<EssaVar, Long> active = EconomicMap.create();
        /** map of Graal nodes to their ESSA var, possibly adding pi nodes. */
        private final EconomicMap<Node, EssaVar> piMap = EconomicMap.create();
        public final LoadIndexedNode load;
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
        public DemandProver(EssaVar.LengthNodeVar a, LoadIndexedNode load, Iterable<PiContext> piContexts) {
            this.load = load;
            this.piEssa = EconomicMap.create();
            this.a = a;
            System.out.println("\nDemandProver init: array=" + a + ", load=" + load);
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

        public void createPiEssa(Iterable<PiContext> piContexts) {
            assert piEssa.isEmpty();

            for (var context : piContexts) {
                System.out.println("adding PiContext: " + context);
                // add virtual pi nodes.
                for (var base : context.piBases) {
                    var baseVar = resolveNode(base);
                    var piNew = EssaVar.pi(baseVar);
                    System.out.printf("adding pi: pi %s = %s%n", base, piNew);
                    piEssa.put(Pair.create(baseVar, piNew), 0L);
                    piMap.put(base, piNew);
                }
            }
            for (var context : piContexts) {
                for (var it = context.overlay.getEntries(); it.advance(); ) {
                    piEssa.put(both(this::resolveEssaVar, it.getKey()), it.getValue());
                    System.out.printf("adding overlay: %s, %s%n", it.getKey(), it.getValue());
                }
            }
        }

        /**
         * attempts to prove an edge from array length node to the given index node.
         * if proven, this will bound "index < array length" and hence this array index needs no bounds check.
         */
        public Lattice prove(Node v, long c) {
            depth = 1;
            return prove(resolveNode(v), c); // XXX need to be smarter with this.
        }

        private Lattice prove(EssaVar v, long c) {
            if (v.base() instanceof ArrayLengthNode len) {
                v = new EssaVar.LengthNodeVar(len.array());
            }
            var startindent = depth > 0 ? "|".repeat(depth-1) + "/" : "";
            var finishindent = depth > 0 ? "|".repeat(depth-1) + "\\" : "";
            var indent = "|".repeat(depth);
            System.out.printf("%sprove: -> %s (i.e. len - (%s) <= %d)%n", startindent, v, v, c);
            depth++;
            var result = prove(v, c, indent);
            depth--;
            System.out.printf("%s= %s%n", finishindent, result);
            return result;
        }

        private Lattice prove(EssaVar v, long c, String indent) {

            var ckey = Pair.create(a, v);
            if (C.get(ckey) == null)
                C.put(ckey, new TreeMap<>());
            var cmap = C.get(ckey);

            for (var proven : cmap.entrySet()) {
                var e = proven.getKey();
                var ret = proven.getValue();
                // same or stronger difference was already proven
                if (e <= c && ret == Lattice.True) {
                    System.out.printf("%s  by already proven stronger difference,%n", indent);
                    return Lattice.True;
                }
                // same or weaker difference was already disproved
                if (e >= c && ret == Lattice.False) {
                    System.out.printf("%s  by already disproven weaker difference,%n", indent);
                    return Lattice.False;
                }
                // v is on a cycle that was reduced for same or stronger difference
                if (e <= c && ret == Lattice.Reduced) {
                    System.out.printf("%s  by already reduced stronger difference,%n", indent);
                    return Lattice.Reduced;
                }
            }
            // traversal reached the source vertex, success if a - a <= c
            if (a.base().equals(v.base()) && c >= 0) {
                System.out.printf("%s  by base case,%n", indent);
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
                System.out.printf("%s  by no incoming constraints,%n", indent);
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
                if (c < active.get(v)) {
                    System.out.printf("%s  by amplifying cycle,%n", indent);
                    return Lattice.False;
                } else {
                    // harmless cycle
                    System.out.printf("%s  by harmless cycle,%n", indent);
                    return Lattice.Reduced;
                }
            }
            active.put(v, c);
            System.out.printf("%s... parents of %s%n", indent, v);
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