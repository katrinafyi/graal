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
import java.util.stream.StreamSupport;

import jdk.vm.ci.meta.Constant;
import jdk.vm.ci.meta.DeoptimizationAction;
import jdk.vm.ci.meta.DeoptimizationReason;
import jdk.vm.ci.meta.JavaConstant;
import jdk.vm.ci.meta.PrimitiveConstant;
import org.graalvm.collections.EconomicMap;
import org.graalvm.collections.EconomicSet;
import org.graalvm.collections.Equivalence;
import org.graalvm.collections.Pair;
import org.graalvm.compiler.core.common.type.StampFactory;
import org.graalvm.compiler.debug.DebugContext;
import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.graph.NodeFlood;
import org.graalvm.compiler.nodes.AbstractEndNode;
import org.graalvm.compiler.nodes.ConstantNode;
import org.graalvm.compiler.nodes.GraphState;
import org.graalvm.compiler.nodes.GuardNode;
import org.graalvm.compiler.nodes.*;
import org.graalvm.compiler.nodes.NamedLocationIdentity;
import org.graalvm.compiler.nodes.NodeView;
import org.graalvm.compiler.nodes.StructuredGraph;
import org.graalvm.compiler.nodes.calc.AddNode;
import org.graalvm.compiler.nodes.calc.ConditionalNode;
import org.graalvm.compiler.nodes.calc.IntegerLessThanNode;
import org.graalvm.compiler.nodes.calc.NotNode;
import org.graalvm.compiler.nodes.cfg.ControlFlowGraph;
import org.graalvm.compiler.nodes.cfg.HIRBlock;
import org.graalvm.compiler.nodes.extended.AnchoringNode;
import org.graalvm.compiler.nodes.java.ArrayLengthNode;
import org.graalvm.compiler.nodes.memory.ReadNode;
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

        var end = addPiNodes( graph.start(), new ArrayDeque<>(), EconomicSet.create());

        // from CE
        ControlFlowGraph cfg;
//        cfg = ControlFlowGraph.compute(graph, true, true, true, true);
//        ControlFlowGraph.RecursiveVisitor<?> visitor = createVisitor(graph, cfg, blockToNodes, nodeToBlock, context);
//        cfg.visitDominatorTree(visitor, graph.isBeforeStage(GraphState.StageFlag.VALUE_PROXY_REMOVAL));

        // a weighted directed graph, with (src, tgt) as keys.
        EconomicMap<Pair<Node, Node>, Long> essa = EconomicMap.create();

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
            } else if (node instanceof IfNode branch) {
                var tcase = branch.trueSuccessor();
                for (var tnode : tcase.getBlockNodes()) {
                    // get everything bounded by the tcase
                }
                var fcase = branch.falseSuccessor();

            }

            System.out.println(node.getClass().toString() + " " +  node);
        }

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

    private EconomicMap<Node, Node> makePiMap(AnchoringNode anchor, ValueNode x, ValueNode y, LogicNode cond, boolean whichBranch) {
        var graph = cond.graph();
        var guard = new GuardNode(cond, anchor, DeoptimizationReason.None, DeoptimizationAction.None, !whichBranch, null, null);

        return EconomicMap.of(
                x, graph.addOrUnique(PiNode.create(x, x.stamp(NodeView.DEFAULT), guard)),
                y, graph.addOrUnique(PiNode.create(y, y.stamp(NodeView.DEFAULT), guard)));
    }

    private void doPiReplacements(Node node, Deque<Node> children, final Deque<EconomicMap<Node, Node>> replacements) {

        for (var inp : node.inputs()) {
            Node repl = null;
            for (var em : replacements) {
                if (repl != null) break;
                repl = em.get(inp);
            }

            if (repl != null)
                node.replaceAllInputs(inp, repl);
        }
    }

    private AbstractEndNode addPiNodes(Node node, final Deque<EconomicMap<Node, Node>> replacements, final EconomicSet<Node> seen) {
        // this will perform a top-down visit of the control flow tree, inserting pi nodes at branches.
        // XXX limitation: we only pi-ify precisely the operands to the < condition.
        // hopefully, the graph algorithm handles this transitively.
        while (node != null) {
            System.out.println("addPiNodes: " + node.toString());
            if (node instanceof AbstractEndNode end && end.merge() != null && end.merge() instanceof MergeNode) {
                return end;
            }

            doPiReplacements(node, new ArrayDeque<>(), replacements);

            if (node instanceof IfNode ifnode) {
                var cond = ifnode.condition();
                if (cond instanceof IntegerLessThanNode ltnode) {
                    System.out.println("recursing into if branches... " + ifnode.toString());
                    var x = ltnode.getX();
                    var y = ltnode.getY();

                    replacements.push(makePiMap(ifnode.trueSuccessor(), x, y, cond, true));
                    var tend = addPiNodes(ifnode.trueSuccessor(), replacements, EconomicSet.create());
                    replacements.pop();

                    replacements.push(makePiMap(ifnode.falseSuccessor(), x, y, cond, false));
                    var fend = addPiNodes(ifnode.trueSuccessor(), replacements, EconomicSet.create());
                    replacements.pop();

                    var merge1 = tend != null ? tend.merge() : null;
                    var merge2 = fend != null ? fend.merge() : null;
                    assert Objects.equals(merge1, merge2) : "differing merge results " + merge1 + " | " + merge2;
                    node = merge1;
                    continue;
                } else {
                    System.out.println("unknown if condition: " + cond.toString());
                }
            }

            List<AbstractEndNode> ends = new ArrayList<>();
            for (var succ : node.cfgSuccessors()) {
                replacements.push(EconomicMap.emptyMap());
                ends.add(addPiNodes(succ, replacements, EconomicSet.create()));
                replacements.pop();
            }
            if (ends.isEmpty()) {
                System.out.println("... " + node + " empty successors");
                return null;
            } else {
                boolean unique = true;
                var x = ends.get(0);
                for (var v : ends)
                    unique &= Objects.equals(x, v);
                System.out.println("... " + node + " unique=" + unique + " succ=" + x);
                return unique ? x : null;
            }
        }

        return null;
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