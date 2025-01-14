package org.graalvm.compiler.core.test;

import jdk.vm.ci.meta.DeoptimizationReason;
import jdk.vm.ci.meta.ResolvedJavaMethod;
import org.graalvm.compiler.api.replacements.SnippetReflectionProvider;
import org.graalvm.compiler.api.test.Graal;
import org.graalvm.compiler.core.phases.BaseTier;
import org.graalvm.compiler.debug.DebugContext;
import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.loop.phases.ConvertDeoptimizeToGuardPhase;
import org.graalvm.compiler.nodes.GuardNode;
import org.graalvm.compiler.nodes.StructuredGraph;
import org.graalvm.compiler.nodes.extended.BytecodeExceptionNode;
import org.graalvm.compiler.nodes.spi.CoreProviders;
import org.graalvm.compiler.phases.common.ArrayBoundsCheckEliminationPhase;
import org.graalvm.compiler.phases.common.CanonicalizerPhase;
import org.graalvm.compiler.phases.common.ConditionalEliminationPhase;
import org.graalvm.compiler.phases.common.DeadCodeEliminationPhase;
import org.graalvm.compiler.phases.common.FloatingReadPhase;
import org.graalvm.compiler.phases.common.HighTierLoweringPhase;
import org.graalvm.compiler.phases.common.IterativeConditionalEliminationPhase;
import org.graalvm.compiler.printer.BinaryGraphPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class ArrayBoundsCheckEliminationTest extends GraalCompilerTest {

    private static final String[] tests = {
            "constant_p", // 0
            "constant_f", // 1
            "param_p", // 2
            "param_f", // 3
            "param_trans_f", // 4
            "loop1_p", // 5
            "loop1_f", // 6
            "loop1plus5_p", // 7
            "loop1plus5_f", // 8
            "loop1plusc_p", // 9
            "loop1plusc_f", // 10
            "loop1double_p", // 11
            "loop1double_f", // 12
            "loop2i_p", // 13
            "loop2i_f", // 14
            "loop2triangular_p", // 15
            "loop2trianglular_f", // 16
            "loop2lowertri_p", // 17
            "loop2lowertri_f", // 18
            "loop2uppertri_p", // 19
            "loop2uppertri_f", // 20
            "loop2sum_p", // 21
            "loop2sum_f", // 22
            "loop2sumplus5_p", // 23
            "loop2sumplus5_f", // 24
            "loop2addmul_p", // 25
            "loop2addmul_f", // 26
            "bubblesort", // 27
    };
    class Tier extends BaseTier<CoreProviders> {
        public Tier() {
            CanonicalizerPhase canonicalizer = CanonicalizerPhase.create();
            appendPhase(canonicalizer);
            appendPhase(new HighTierLoweringPhase(canonicalizer));
            appendPhase(new FloatingReadPhase(canonicalizer));
            appendPhase(new ArrayBoundsCheckEliminationPhase());
        }
    }

    protected void prepareGraph(StructuredGraph graph, CanonicalizerPhase canonicalizer, CoreProviders context, boolean applyLowering) {
        if (applyLowering) {
            new ConvertDeoptimizeToGuardPhase(canonicalizer).apply(graph, context);
            new IterativeConditionalEliminationPhase(canonicalizer, true).apply(graph, context);

            new HighTierLoweringPhase(canonicalizer).apply(graph, context);
//            new GuardLoweringPhase().apply(graph, context);
            new IterativeConditionalEliminationPhase(canonicalizer, true).apply(graph, context);
            canonicalizer.apply(graph, context);
        }
        canonicalizer.apply(graph, context);
//        new ConvertDeoptimizeToGuardPhase(canonicalizer).apply(graph, context);
        new IterativeConditionalEliminationPhase(canonicalizer, true).apply(graph, context);
    }

    private void applyPhases(StructuredGraph graph) throws IOException {


        DebugContext debug = graph.getDebug();
        debug.dump(DebugContext.BASIC_LEVEL, graph, "Graph");

        CoreProviders context = getProviders();
        CanonicalizerPhase canonicalizer = createCanonicalizerPhase();
        CanonicalizerPhase canonicalizer2 = createCanonicalizerPhase();
        try (DebugContext.Scope ignored = debug.scope("ABCETest", graph)) {
            prepareGraph(graph, canonicalizer, context, false);
            new ArrayBoundsCheckEliminationPhase().apply(graph, context);
            canonicalizer2.apply(graph, context);
            new ConditionalEliminationPhase(false).apply(graph, context);
            new DeadCodeEliminationPhase().apply(graph, context);
        } catch (Throwable t) {
            debug.handle(t);
        }

//        new MidTier(getInitialOptions()).apply(graph, getProviders());
//        new Tier().apply(graph, getProviders());

//        canonicalizer.apply(graph, context);

        /* Convert the LoadIndexNode to ReadNode with floating guards. */
//        new HighTierLoweringPhase(canonicalizer).apply(graph, context);
        /* Convert the ReadNode to FloatingReadNode. */
//        new FloatingReadPhase(canonicalizer).apply(graph, context);
        /* Apply the phase that we want to test. */
//        new ArrayBoundsCheckEliminationPhase().apply(graph, context);

//        new HighTierLoweringPhase(canonicalizer, true).apply(graph, context);

        var x = new BinaryGraphPrinter(graph.getDebug(), Graal.getRequiredCapability(SnippetReflectionProvider.class));
        x.print(graph.getDebug(), graph, Collections.emptyMap(), 100, "ArrayBoundsCheckEliminationPhase");
    }


    private void test(int i) {
        assert (0 <= i && i < tests.length) : "tests out of bound";
        ResolvedJavaMethod meth = getResolvedJavaMethod(ArrayBoundsCheckEliminationTestCases.class, tests[i]);
        StructuredGraph graph = parseEager(meth, StructuredGraph.AllowAssumptions.NO);
//        System.out.println(graph);
        try {
            applyPhases(graph);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        for (var x : graph.getNodes()) {
//            System.out.println(x.getNodeClass());
//        }
//        System.out.println();
        var flags = graph.getNodes().filter((Node x) -> {
            if (x instanceof GuardNode) {
                return ((GuardNode) x).getReason() == DeoptimizationReason.BoundsCheckException;
            } else {
                return x instanceof BytecodeExceptionNode;
            }
        }).stream().toList();
        System.out.println(flags);
        System.out.println();

        Assert.assertEquals( tests[i] + " failed,", 0, flags.size());
    }

//    @Test public void test0() { test(0); }
//    @Test public void test1() { test(1); }
//    @Test public void test2() { test(2); }
//    @Test public void test3() { test(3); }
//    @Test public void test4() { test(4); }
//    @Test public void test5() { test(5); }
//    @Test public void test6() { test(6); }
//    @Test public void test7() { test(7); }
//    @Test public void test8() { test(8); }
//    @Test public void test9() { test(9); }
//    @Test public void test10() { test(10); }
//    @Test public void test11() { test(11); }
//    @Test public void test12() { test(12); }
//    @Test public void test13() { test(13); }
//    @Test public void test14() { test(14); }
//    @Test public void test15() { test(15); }
//    @Test public void test16() { test(16); }
//    @Test public void test17() { test(17); }
//    @Test public void test18() { test(18); }
//    @Test public void test19() { test(19); }
//    @Test public void test20() { test(20); }
//    @Test public void test21() { test(21); }
//    @Test public void test22() { test(22); }
//    @Test public void test23() { test(23); }
//    @Test public void test24() { test(24); }
//    @Test public void test25() { test(25); }
//    @Test public void test26() { test(26); }
    @Test public void test27() { test(27); }

}
