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
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

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
import org.graalvm.compiler.nodes.calc.IntegerBelowNode;
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

    sealed interface ESSA {
        record Constant(long c) implements ESSA {}
        record ArrayLength(Node array) implements ESSA {}
        record Node(Node array) implements ESSA {}
    }




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
        deque.push(new PiContext(cfg.getStartBlock().getBeginNode(), EconomicMap.create()));
        var end = addPiNodes(cfg.getStartBlock(), deque);

//        ControlFlowGraph.RecursiveVisitor<?> visitor = createVisitor(graph, cfg, blockToNodes, nodeToBlock, context);
//        cfg.visitDominatorTree(visitor, graph.isBeforeStage(GraphState.StageFlag.VALUE_PROXY_REMOVAL));

        // a weighted directed graph, with (src, tgt) as keys.
        // (u,v) = c   <==>   v - u <= c  <==> c + u >= v
        // i.e., the weight bounds the numerical difference between the target and destination nodes.
        EconomicMap<Pair<Node, Node>, Long> essa = EconomicMap.create();

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
                    for (var map : List.of(truemap, falsemap)) {
                        for (var v : List.of(x, y)) {
                            essa.put(Pair.create(v, map.get(v)), 0L);
                        }
                    }

                    // pi(X) < pi(Y)  <==> pi(X) - pi(Y) <= - 1
                    essa.put(Pair.create(truemap.get(y), truemap.get(x)), -1L);

                    // X >= Y  <==> pi(Y) - pi(X) <= 0
                    essa.put(Pair.create(falsemap.get(x), falsemap.get(y)), 0L);
                }
            } else if (node instanceof final ArrayLengthNode lengthnode) {
                var canonlen = canonicalLengths.get(lengthnode.array());
                if (canonlen == null) {
                    canonicalLengths.put(lengthnode.array(), lengthnode);
                    canonlen = lengthnode;
                }
                essa.put(Pair.create(canonlen, lengthnode), 0L);

            } else if (node instanceof PhiNode phinode) {
                for (var v : phinode.values()) {
                    essa.put(Pair.create(v, phinode), 0L);
                }
            }

            System.out.println(node.getClass().toString() + " " +  node);
        }

        System.out.println("DOT! digraph G {");
        for (var it = essa.getEntries(); it.advance();) {
            System.out.printf("DOT! \"%s\" -> \"%s\" [ label=\"%d\" ];%n", it.getKey().getLeft(), it.getKey().getRight(), it.getValue());
        }
        System.out.println("DOT! }");

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

    private PiContext makePiMap(FixedNode begin, AnchoringNode anchor, ValueNode x, ValueNode y, LogicNode cond, boolean whichBranch) {
        var graph = cond.graph();
        var guard = new GuardNode(cond, anchor, DeoptimizationReason.None, DeoptimizationAction.InvalidateRecompile, !whichBranch, null, null);
        guard = graph.addOrUnique(guard);

        EconomicMap<Node, Node> em = EconomicMap.of(
                x, graph.addOrUnique(PiNode.create(x, x.stamp(NodeView.DEFAULT), guard)),
                y, graph.addOrUnique(PiNode.create(y, y.stamp(NodeView.DEFAULT), guard)));
        assert !Objects.equals(x, em.get(x)) : "pi node not created for " + x;
        assert !Objects.equals(y, em.get(y)) : "pi node not created for " + y;
        return new PiContext(begin, em);
    }

    private static class PiContext {
        public final EconomicMap<Node, Node> replacements;
        // a mapping of array nodes to their length nodes. used when constructing pi nodes after array-accesses.
        public final NodeMap<ArrayLengthNode> lengthNodes;
        public final FixedNode begin; // exclusive!
        public final EconomicSet<HIRBlock> blocks = EconomicSet.create();

        private PiContext(FixedNode begin, EconomicMap<Node, Node> replacements) {
            this.begin = begin;
            this.replacements = replacements;
            this.lengthNodes = new NodeMap<>(begin.graph());
        }
    }

    private void doPiReplacements(ControlFlowGraph cfg, PiContext context) {

        final var beginBlock = cfg.getNodeToBlock().get(context.begin);

        NodeFlood flood = context.begin.graph().createNodeFlood();
        flood.add(context.begin);
        {
            var it = beginBlock.getNodes().iterator();
            //noinspection StatementWithEmptyBody
            while (!Objects.equals(it.next(), context.begin));
            while (it.hasNext()) flood.add(it.next());
        }

        for (var block : context.blocks) {
            if (Objects.equals(block, beginBlock)) continue;
            for (var node : block.getNodes()) {
                flood.add(node);
            }
        }

        for (var node : flood) {
            flood.addAll(node.inputs());
        }

        // at this point, we have constructed a 'cone' of all input dependencies within this Pi variable's range.
        // now, we can take each pi-ed variable and check which of its uses appear within this cone.

        // actually, maybe we can avoid this... it would be much easier if we constructed the pi-nodes "on-demand"
        // based on the location of the bounds-check we aim to eliminate. this can be done by simple substitutions on the graph.
        // moreover, this is safe (?) because SSA variables have a fixed value and this will only be used for a single substitution
        // at a single point. maybe less efficient.

        for (var it = context.replacements.getEntries(); it.advance(); ) {
            var orig = it.getKey();
            var pi = it.getValue();

            for (var user : orig.usages()) {


            }





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
            ctx.blocks.add(block);
        }

        var graph = block.getBeginNode().graph();

        System.out.println("addPiNodes: " + block);
        for (var node : block.getNodes()) {
            doPiReplacements(node, new ArrayDeque<>(), replacements);

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

                var cond = graph.addOrUnique(new IntegerBelowNode(load.index(), length));
                var guard = new GuardNode(cond, block.getBeginNode(), DeoptimizationReason.None, DeoptimizationAction.InvalidateRecompile, false, null, null);
                guard = graph.addOrUniqueWithInputs(guard);
                var pi = graph.addOrUnique(PiNode.create(load.index(), load.index().stamp(NodeView.DEFAULT), guard));

                var context = new PiContext(load, EconomicMap.of(load.index(), pi));
                context.blocks.add(block);
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

                pi = makePiMap(truesucc, truesucc, x, y, cond, true);
                replacements.push(pi);
                System.out.println(" begin tcase: " + truesucc);
                tend = addPiNodes(nodetoblock.get(truesucc), replacements);
                System.out.println(" end tcase: " + truesucc);
                pi = replacements.pop();
                while (!pi.begin.equals(truesucc)) pi = replacements.pop();
                piContexts.put(pi.begin, pi);
                System.out.println("piContexts: " + pi.begin + " --> " + pi);
                // pop multiple contexts since array accesses may have inserted pi variables too.

                pi = makePiMap(falsesucc, falsesucc, x, y, cond, false);
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

                piContexts.put(truesucc, new PiContext(truesucc, EconomicMap.create()));
                piContexts.put(falsesucc, new PiContext(falsesucc, EconomicMap.create()));

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