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
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;

import jdk.vm.ci.meta.DeoptimizationAction;
import jdk.vm.ci.meta.DeoptimizationReason;
import jdk.vm.ci.meta.PrimitiveConstant;
import org.graalvm.collections.EconomicMap;
import org.graalvm.collections.EconomicSet;
import org.graalvm.collections.Pair;
import org.graalvm.compiler.debug.DebugContext;
import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.graph.NodeFlood;
import org.graalvm.compiler.graph.NodeMap;
import org.graalvm.compiler.nodeinfo.Verbosity;
import org.graalvm.compiler.nodes.AbstractEndNode;
import org.graalvm.compiler.nodes.ConstantNode;
import org.graalvm.compiler.nodes.GraphState;
import org.graalvm.compiler.nodes.GuardNode;
import org.graalvm.compiler.nodes.*;
import org.graalvm.compiler.nodes.NodeView;
import org.graalvm.compiler.nodes.StructuredGraph;
import org.graalvm.compiler.nodes.calc.AddNode;
import org.graalvm.compiler.nodes.calc.IntegerLessThanNode;
import org.graalvm.compiler.nodes.cfg.ControlFlowGraph;
import org.graalvm.compiler.nodes.cfg.HIRBlock;
import org.graalvm.compiler.nodes.extended.AnchoringNode;
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
     * {@link Options#ReduceDCE}.
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
     * {@linkplain Optionality#Required non-optional} or {@link Options#ReduceDCE} is false.
     */
    public ArrayBoundsCheckEliminationPhase(Optionality optionality) {
        this.optional = optionality == Optionality.Optional;
    }

    private final boolean optional;
    private final boolean disabled = false;

    private ControlFlowGraph cfg;
    private final EconomicMap<Node, PiContext> piContexts = EconomicMap.create();
    private NodeMap<ArrayLengthNode> canonicalLengths;

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

    Node canonicalizeEssaNode(Node node) {
        if (node instanceof ArrayLengthNode lennode) {
            return Objects.requireNonNull(canonicalLengths.get(lennode.array()));
        } else if (node instanceof ValueProxyNode proxy) {
            return proxy.getOriginalNode();
        }
        return node;
    }

    @Override
    public void run(StructuredGraph graph) {
        if (disabled || optional && Options.DisableABCE.getValue(graph.getOptions())) {
            return;
        }


        // from CE
        cfg = ControlFlowGraph.compute(graph, true, true, true, true);
        for (var bb : cfg.getBlocks()) {
            System.out.println(bb.toString(Verbosity.All));
            System.out.println("ended by: " + bb.getEndNode());
            for (var node : bb.getNodes())
                System.out.println(node);
            System.out.println();
        }

        final ArrayDeque<PiContext> deque = new ArrayDeque<>();
        deque.push(new PiContext(List.of(), cfg.getStartBlock().getBeginNode(), cfg.getStartBlock(), EconomicMap.create()));
        var end = addPiNodes(cfg.getStartBlock(), deque);

//        ControlFlowGraph.RecursiveVisitor<?> visitor = createVisitor(graph, cfg, blockToNodes, nodeToBlock, context);
//        cfg.visitDominatorTree(visitor, graph.isBeforeStage(GraphState.StageFlag.VALUE_PROXY_REMOVAL));

        // a weighted directed graph, with (src, tgt) as keys.
        // (u,v) = c   <==>   v - u <= c  <==> c + u >= v
        // i.e., the weight bounds the numerical difference between the target and destination nodes.
        EconomicMap<Pair<Node, Node>, Long> essa = EconomicMap.create();
        EconomicSet<PhiNode> phis = EconomicSet.create();

        LoadIndexedNode theload = null;

        canonicalLengths = new NodeMap<>(graph);
        // graal ir does not explicitly assign to local variables. instead, we can pretend each SSA node is an assignment
        // to a variable called itself.
        for (Node node : graph.getNodes()) {
            // ignored:
            // vi = Aj.length
            // vi = c
            if (node instanceof AddNode add) {
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
                    essa.put(Pair.create(other, node), weight);
            } else if (node instanceof IfNode ifnode) {
                var tpi = piContexts.get(ifnode.trueSuccessor());
                var fpi = piContexts.get(ifnode.falseSuccessor());
                var truemap = tpi.replacements;
                var falsemap = fpi.replacements;
                if (ifnode.condition() instanceof IntegerLessThanNode ltnode) {
                    // X < Y
                    var x = ltnode.getX();
                    var y = ltnode.getY();

                    // for both true+false, relate the pi vars to their original vars.
//                    for (var map : List.of(truemap, falsemap)) {
//                        for (var v : List.of(x, y)) {
//                            essa.put(Pair.create(v, map.get(v)), 0L);
//                        }
//                    }

                    // pi(X) < pi(Y)  <==> pi(X) - pi(Y) <= - 1
                    tpi.overlay.put(Pair.create(EssaVar.pi(y), EssaVar.pi(x)), -1L);

                    // X >= Y  <==> pi(Y) - pi(X) <= 0
//                    essa.put(Pair.create(falsemap.get(x), falsemap.get(y)), 0L);
                    fpi.overlay.put(Pair.create(EssaVar.pi(x), EssaVar.pi(y)), 0L);
                }
            } else if (node instanceof final ArrayLengthNode lengthnode) {
                var canonlen = canonicalLengths.get(lengthnode.array());
                if (canonlen == null) {
                    canonicalLengths.put(lengthnode.array(), lengthnode);
//                    canonlen = lengthnode;
                }
//                essa.put(Pair.create(canonlen, lengthnode), 0L);

            } else if (node instanceof PhiNode phinode) {
                phis.add(phinode);
                for (var v : phinode.values()) {
                    essa.put(Pair.create(v, phinode), 0L);
                }
            } else if (node instanceof LoadIndexedNode loadnode) {
                var canonlen = canonicalLengths.get(loadnode.array());
                piContexts.get(loadnode).overlay.put(
                        Pair.create(EssaVar.pure(canonlen), EssaVar.pi(loadnode.index())), -1L
                );
                if (theload == null) theload = loadnode;
            }

            System.out.println(node.getClass() + " " +  node);
        }

        EconomicMap<Pair<Node, Node>, Long> replaced = EconomicMap.create();
        for (var it = essa.getEntries(); it.advance() ;) {
            var key = it.getKey();
            var value = it.getValue();
            var canon = Pair.create(canonicalizeEssaNode(key.getLeft()), canonicalizeEssaNode(key.getRight()));
            if (!Objects.equals(key, canon)) {
                it.remove();
                replaced.put(canon, value);
            }
        }
        essa.putAll(replaced);


        // begin eliminating bounds checks
        var theblock = cfg.getNodeToBlock().get(theload);
        var lengthnode = canonicalLengths.get(theload.array());
        var indexnode = theload.index();
        List<PiContext> piContextsInScope = new ArrayList<>();
        for (var it = piContexts.getEntries(); it.advance(); ) {
            var ctx = it.getValue();
            if (ctx.fullBlocks.contains(theblock) || ctx.beginNodes.contains(theload)) {
                piContextsInScope.add(ctx);
                System.out.println(ctx.beginNodes);
            }
        }

        System.out.println("DOT! digraph G {");
        for (var it = essa.getEntries(); it.advance();) {
            System.out.printf("DOT! \"%s\" -> \"%s\" [ label=\"%d\" ];%n", it.getKey().getLeft(), it.getKey().getRight(), it.getValue());
        }
        System.out.println("DOT! }");

        System.out.println("preparing to eliminate check for " + theload);
        var prover = new DemandProver(essa, piContextsInScope, lengthnode);
        System.out.println(prover.prove(indexnode, -1L));

        System.out.println("DOT2! digraph G {");
        for (var it = prover.piEssa.getEntries(); it.advance();) {
            System.out.printf("DOT2! \"%s\" -> \"%s\" [ label=\"%d\" ];%n", it.getKey().getLeft(), it.getKey().getRight(), it.getValue());
        }
        System.out.println("DOT2! }");



        // following is from DCE
        NodeFlood flood = graph.createNodeFlood();
        int totalNodeCount = graph.getNodeCount();
        flood.add(graph.start());
        iterateSuccessorsAndInputs(flood);
        boolean changed = false;
        for (GuardNode guard : graph.getNodes(GuardNode.TYPE)) {
            if (flood.isMarked(guard.getAnchor().asNode())) {
                flood.add(guard);
                changed = true;
            }
        }
        if (changed) {
            iterateSuccessorsAndInputs(flood);
        }
        int totalMarkedCount = flood.getTotalMarkedCount();
        if (totalNodeCount == totalMarkedCount) {
            // All nodes are live => nothing more to do.
            return;
        } else {
            // Some nodes are not marked alive and therefore dead => proceed.
            assert totalNodeCount > totalMarkedCount;
        }

        deleteNodes(flood, graph);
    }

    private PiContext makePiMap(FixedNode begin, HIRBlock beginBlock, AnchoringNode anchor, ValueNode x, ValueNode y, LogicNode cond, boolean whichBranch) {
        var graph = cond.graph();
        var guard = new GuardNode(cond, anchor, DeoptimizationReason.None, DeoptimizationAction.InvalidateRecompile, !whichBranch, null, null);
        guard = graph.addOrUnique(guard);

        EconomicMap<Node, Node> em = EconomicMap.of(
                x, graph.addOrUnique(PiNode.create(x, x.stamp(NodeView.DEFAULT), guard)),
                y, graph.addOrUnique(PiNode.create(y, y.stamp(NodeView.DEFAULT), guard)));
        assert !Objects.equals(x, em.get(x)) : "pi node not created for " + x;
        assert !Objects.equals(y, em.get(y)) : "pi node not created for " + y;

        return new PiContext(List.of(x,y), begin, beginBlock, em);
    }

    private static class PiContext {
        public final EconomicMap<Node, Node> replacements;
        public final EconomicMap<Pair<EssaVar, EssaVar>, Long> overlay = EconomicMap.create();
        // a mapping of array nodes to their length nodes. used when constructing pi nodes after array-accesses.
        public final NodeMap<ArrayLengthNode> lengthNodes;
        public final FixedNode begin; // exclusive!

        /** set of nodes in the begin block which are affected by this context. */
        public final EconomicSet<FixedNode> beginNodes = EconomicSet.create();
        /** set of blocks which are fully-affected by this context. */
        public final EconomicSet<HIRBlock> fullBlocks = EconomicSet.create();
        public final List<Node> piBases;

        private PiContext(Node piBase, FixedNode begin, HIRBlock beginBlock, EconomicMap<Node, Node> replacements) {
            this(List.of(piBase), begin, beginBlock, replacements);
        }

        private PiContext(List<Node> piBases, FixedNode begin, HIRBlock beginBlock, EconomicMap<Node, Node> replacements) {
            this.piBases = piBases;
            this.begin = begin;
            this.replacements = replacements;
            this.lengthNodes = new NodeMap<>(begin.graph());

            var it = beginBlock.getNodes().iterator();
            while (it.hasNext() && !it.next().equals(begin));
            while (it.hasNext()) beginNodes.add(it.next());

        }
    }

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

                if (length == null) {
                    // before:
                    // load
                    // succ

                    // after:
                    // load
                    // length
                    // succ
                    var succ = load.successors().first();
                    length = graph.addOrUnique(new ArrayLengthNode(load.array()));
                    succ.replaceAtPredecessor(length); // performs load -> length edge
                    length.replaceFirstSuccessor(null, succ); // length -> succ

                    lastLengthNodes.put(load.array(), length);
                }

//                var cond = graph.addOrUnique(new IntegerBelowNode(load.index(), length));
//                var guard = new GuardNode(cond, block.getBeginNode(), DeoptimizationReason.None, DeoptimizationAction.InvalidateRecompile, false, null, null);
//                guard = graph.addOrUniqueWithInputs(guard);
//                var pi = graph.addOrUnique(PiNode.create(load.index(), load.index().stamp(NodeView.DEFAULT), guard));

                var context = new PiContext(load.index(), load, block, EconomicMap.create());
                piContexts.put(context.begin, context);
                replacements.add(context);
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

                pi = makePiMap(truesucc, nodetoblock.get(truesucc), truesucc, x, y, cond, true);
                replacements.push(pi);
                System.out.println(" begin tcase: " + truesucc);
                tend = addPiNodes(nodetoblock.get(truesucc), replacements);
                System.out.println(" end tcase: " + truesucc);
                pi = replacements.pop();
                while (!pi.begin.equals(truesucc)) pi = replacements.pop();
                piContexts.put(pi.begin, pi);
                System.out.println("piContexts: " + pi.begin + " --> " + pi);
                // pop multiple contexts since array accesses may have inserted pi variables too.

                pi = makePiMap(falsesucc, nodetoblock.get(falsesucc), falsesucc, x, y, cond, false);
                replacements.push(pi);
                System.out.println(" begin fcase: " + falsesucc);
                fend = addPiNodes(nodetoblock.get(falsesucc), replacements);
                System.out.println(" end fcase: " + falsesucc);
                pi = replacements.pop();
                while (!pi.begin.equals(falsesucc)) pi = replacements.pop();
                piContexts.put(pi.begin, pi);
                System.out.println("piContexts: " + pi.begin + " --> " + pi);

                merge1 = tend;
                merge2 = fend;
            } else {
                System.out.println("unknown if condition: " + cond.toString());

                var tend = addPiNodes(nodetoblock.get(truesucc), replacements);
                var fend = addPiNodes(nodetoblock.get(falsesucc), replacements);

                piContexts.put(truesucc, new PiContext(List.of(), truesucc, nodetoblock.get(truesucc), EconomicMap.create()));
                piContexts.put(falsesucc, new PiContext(List.of(), falsesucc, nodetoblock.get(falsesucc), EconomicMap.create()));

                merge1 = tend;
                merge2 = fend;
            }
            assert Objects.equals(merge1, merge2) : "differing merge results from " + ifnode + " : " + merge1 + " | " + merge2;

            if (merge1 == null) {
                System.out.println("non-merging if statement: " + ifnode);
                return null;
            }
            System.out.println("merged from if: " + ifnode);
            return addPiNodes(nodetoblock.get(merge1), replacements);

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

    private sealed interface EssaVar {
        record Pi(EssaVar v) implements EssaVar {
            @Override public Node base() { return v.base(); }
        }
        record NodeVar(Node n) implements EssaVar {
            @Override public Node base() { return n; }
        }

        Node base();

        static Pi pi(Node n) {
            return new Pi(pure(n));
        }
        static NodeVar pure(Node n) {
            return new NodeVar(n);
        }
    }

    private static class DemandProver {

        private final EconomicMap<Pair<Node, Node>, Long> essa;
        private final EconomicMap<Pair<EssaVar, EssaVar>, Long> piEssa;
        private final ArrayLengthNode a;
        private final EconomicMap<Pair<ArrayLengthNode, EssaVar>, TreeMap<Long, Lattice>> C = EconomicMap.create();
        private final EconomicMap<EssaVar, Long> active = EconomicMap.create();
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
        public DemandProver(EconomicMap<Pair<Node, Node>, Long> essa, Iterable<PiContext> piContexts, ArrayLengthNode a) {
            this.essa = essa;
            this.piEssa = EconomicMap.create();
            this.a = a;
            System.out.println("DemandProver init: " + a);
            createPiEssa(piContexts);
        }

        private Pair<EssaVar, EssaVar> liftNodePair(Pair<Node, Node> nodePair) {
            return Pair.create(new EssaVar.NodeVar(nodePair.getLeft()), new EssaVar.NodeVar(nodePair.getRight()));
        }

        public void createPiEssa(Iterable<PiContext> piContexts) {
            assert piEssa.isEmpty();

            EconomicSet<Node> piBases = EconomicSet.create();
            for (var context : piContexts) {
                piBases.addAll(context.piBases);
                // add virtual pi nodes.
                for (var base : context.piBases) {
                    piEssa.put(Pair.create(EssaVar.pure(base), EssaVar.pi(base)), 0L);
                }

                System.out.println("DemandProver adding picontext from: " + context.begin);
                for (var it = context.overlay.getEntries(); it.advance(); ) {
                    piEssa.put(it.getKey(), it.getValue());
                }
            }

            // XXX pi variables of pi variables? need to determine pi-ness by testing if it appears within contexts??
            // we are back at the original problem...
            Function<Node, EssaVar> maybePi = (Node n) ->
                    piBases.contains(n) ? EssaVar.pi(n) : EssaVar.pure(n);

            for (var it = essa.getEntries(); it.advance(); ) {
                var k = it.getKey();
                var v = it.getValue();
                // use pi variables if they exist.
                var r = maybePi.apply(k.getRight());
                if (r.base() instanceof PhiNode phi) {
                    if (phi.inputs().contains(k.getLeft())) {
                        // if this is an input constraint edge, we must point to original phi node.
                        r = EssaVar.pure(phi);
                    }
                }
                piEssa.put(Pair.create(maybePi.apply(k.getLeft()), r), v);
            }
        }

        /**
         * attempts to prove an edge from array length node to the given index node.
         * if proven, this will bound "index < array length" and hence this array index needs no bounds check.
         */
        public Lattice prove(Node v, long c) {
            return prove(EssaVar.pi(v), c); // XXX need to be smarter with this.
        }

        private Lattice prove(EssaVar v, long c) {
            var indent = " ".repeat(depth);
            System.out.printf("%sprove: %s -> %s (i.e. (%s) - (%s) <= %d)%n", indent, a, v, v, a, c);
            depth++;
            var result = prove(v, c, indent);
            depth--;
            System.out.printf("%s= %s%n", indent, result);
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
                if (e <= c && ret == Lattice.True) return Lattice.True;
                // same or weaker difference was already disproved
                if (e >= c && ret == Lattice.False) return Lattice.False;
                // v is on a cycle that was reduced for same or stronger difference
                if (e <= c && ret == Lattice.Reduced) return Lattice.Reduced;
            }
            // traversal reached the source vertex, success if a - a <= c
            if (EssaVar.pure(a).equals(v) && c >= 0) return Lattice.True;

            // if no constraint exist on the value of v, we fail
            // recall: edge u -c-> v constrains v by v - u <= c.
            boolean has = false;
            for (var it = piEssa.getEntries(); it.advance(); ) {
                if (it.getKey().getRight().equals(v)) {
                    has = true;
                    break;
                }
            }
            if (!has) return Lattice.False;

            // a cycle at v
            if (active.containsKey(v)) {
                // an amplifying cycle which can become arbitrarily large
                if (c > active.get(v)) return Lattice.False;
                // harmless cycle
                else return Lattice.Reduced;
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

    private static void iterateSuccessorsAndInputs(NodeFlood flood) {
        Node.EdgeVisitor consumer = new Node.EdgeVisitor() {
            @Override
            public Node apply(Node n, Node succOrInput) {
                assert succOrInput.isAlive() : "dead successor or input " + succOrInput + " in " + n;
                flood.add(succOrInput);
                return succOrInput;
            }
        };

        for (Node current : flood) {
            if (current instanceof AbstractEndNode) {
                AbstractEndNode end = (AbstractEndNode) current;
                flood.add(end.merge());
            } else {
                current.applySuccessors(consumer);
                current.applyInputs(consumer);
            }
        }
    }

    private static void deleteNodes(NodeFlood flood, StructuredGraph graph) {
        Node.EdgeVisitor consumer = new Node.EdgeVisitor() {
            @Override
            public Node apply(Node n, Node input) {
                if (input.isAlive() && flood.isMarked(input)) {
                    input.removeUsage(n);
                }
                return input;
            }
        };

        for (Node node : graph.getNodes()) {
            if (!flood.isMarked(node)) {
                node.markDeleted();
                node.applyInputs(consumer);
                graph.getOptimizationLog().report(DebugContext.VERY_DETAILED_LEVEL, ArrayBoundsCheckEliminationPhase.class, "NodeRemoval", node);
            }
        }
    }

    public static class Instance implements ControlFlowGraph.RecursiveVisitor<Integer> {

        @Override
        public Integer enter(HIRBlock b) {
            return null;
        }

        @Override
        public void exit(HIRBlock b, Integer value) {

        }
    }
}