package org.graalvm.compiler.core.test;

import jdk.vm.ci.meta.ResolvedJavaMethod;
import org.graalvm.compiler.debug.DebugContext;
import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.nodes.StructuredGraph;
import org.graalvm.compiler.nodes.java.LoadIndexedNode;
import org.graalvm.compiler.nodes.spi.CoreProviders;
import org.graalvm.compiler.phases.common.ArrayBoundsCheckEliminationPhase;
import org.graalvm.compiler.phases.common.CanonicalizerPhase;
import org.graalvm.compiler.phases.common.IterativeConditionalEliminationPhase;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("unused")
public class ArrayBoundsCheckEliminationPiTests extends GraalCompilerTest {
    private final ArrayBoundsCheckEliminationPhase.DemandProver.Lattice TRUE = ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.True;
    private final ArrayBoundsCheckEliminationPhase.DemandProver.Lattice REDUCED = ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.Reduced;
    private final ArrayBoundsCheckEliminationPhase.DemandProver.Lattice FALSE = ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.False;

    private final List<ArrayBoundsCheckEliminationPhase.DemandProver.Lattice> REDUNDANT = List.of(REDUCED, TRUE);
    private final List<ArrayBoundsCheckEliminationPhase.DemandProver.Lattice> NON_REDUNDANT = List.of(FALSE);
    List<LoadIndexedNode> loads;
    ArrayBoundsCheckEliminationPhase phase;

    private void prepare(String testMethod) {
        prepare(testMethod, getClass());
    }

    private void prepare(String testMethod, Class<?> clazz) {
        ResolvedJavaMethod meth = getResolvedJavaMethod(clazz, testMethod);
        StructuredGraph graph = parseEager(meth, StructuredGraph.AllowAssumptions.NO);

        DebugContext debug = graph.getDebug();
        debug.dump(DebugContext.BASIC_LEVEL, graph, "Graph");

        CoreProviders context = getProviders();
        CanonicalizerPhase canonicalizer = createCanonicalizerPhase();
        try (DebugContext.Scope ignored = debug.scope("ABCETest", graph)) {
            canonicalizer.apply(graph, context);
            new IterativeConditionalEliminationPhase(canonicalizer, true).apply(graph, context);
            phase = new ArrayBoundsCheckEliminationPhase();
            phase.apply(graph, context);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        loads = graph.getNodes().stream()
                .map(x -> x instanceof LoadIndexedNode load ? load : null)
                .filter(Objects::nonNull).toList();
    }

    private ArrayBoundsCheckEliminationPhase.EssaVar pi(Node n) {
        return ArrayBoundsCheckEliminationPhase.EssaVar.pi(n);
    }
    private ArrayBoundsCheckEliminationPhase.EssaVar pi(ArrayBoundsCheckEliminationPhase.EssaVar n) {
        return ArrayBoundsCheckEliminationPhase.EssaVar.pi(n);
    }


    private int two_if(int i, int[] a) {
        if (1 <= i) {
            if (i <= a.length - 2) {
                return a[i];
            }
        }
        return -1;
    }
    private int one_if(int i, int[] a) {
        return (1 <= i) ? a[i] : -1;
    }
    @Test
    public void test_two_if() {
        prepare("two_if");
        Assert.assertEquals(1, phase.upperProvers.size());
        Assert.assertEquals(1, loads.size());
        var load = loads.get(0);
        var prover = phase.upperProvers.get(0);
        Assert.assertEquals("pi correctness two_if", pi(pi(load.index())), prover.resolveNode(load.index()));
        Assert.assertEquals("elimination two_if", TRUE, prover.prove());
    }
    @Test
    public void test_one_if() {
        prepare("one_if");
        System.out.println(phase.upperProvers);
        Assert.assertEquals(1, phase.upperProvers.size());
        Assert.assertEquals(1, loads.size());
        var load = loads.get(0);
        var prover = phase.upperProvers.get(0);
        Assert.assertEquals("pi one_if", pi(load.index()), prover.resolveNode(load.index()));
        Assert.assertEquals("non-elimination two_if", ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.False, prover.prove());
    }

    private int array_two_load(int i, int[] a, boolean b) {
        int s = a[i];
        if (b) s += a[i];
        return s;
    }

    @Test
    public void test_array_two_load() {
        prepare("array_two_load");
        System.out.println(phase.upperProvers);
        Assert.assertEquals(2, phase.upperProvers.size());
        Assert.assertEquals(2, loads.size());
        var load = loads.get(0);
        var prover1 = phase.upperProvers.get(0);
        var prover2 = phase.upperProvers.get(1);
        Assert.assertEquals("pi array_load second load", pi(load.index()), prover2.resolveNode(load.index()));
        Assert.assertEquals("non-elimination array_two_load " + prover1, FALSE, prover1.prove());
        Assert.assertEquals("elimination array_two_load " + prover2, TRUE, prover2.prove());
    }

    public static int bubblesort(int[] a) {
        var limit = a.length;
        var st = -1;
        var s = 0;
        while (st < limit) {
            st++;
            limit--;
            for (var j = st; j < limit; j++) {
                if (a[j] > a[j+1]) {
                    s += 1;
//                    var tmp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = tmp;
                }
            }

            for (var j = limit; --j >= st; ) {
                if (a[j] > a[j+1]) {
                    s += 1;
//                    var tmp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = tmp;
                }
            }
        }
        return s;
    }

    @Test
    public void test_bubblesort() {
        prepare("bubblesort");
        System.out.println(phase.upperProvers);
        Assert.assertEquals(4, phase.upperProvers.size());
        for (var provers : List.of(phase.upperProvers, phase.lowerProvers)) {
            var side = provers == phase.upperProvers ? "upper" : "lower";
            for (var p : provers) {
                Assert.assertEquals(side + " redundant: " + p.load, REDUCED, p.prove());
            }
        }
    }

    private void testCommon(String name) {
        prepare(name, ArrayBoundsCheckEliminationTestCases.class);
        assert name.endsWith("_f") || name.endsWith("_p");
        for (var provers : List.of(phase.upperProvers, phase.lowerProvers)) {
            var expected = name.endsWith("_f") || provers == phase.lowerProvers ? REDUNDANT : NON_REDUNDANT;
            var side = provers == phase.upperProvers ? "upper" : "lower";
            if (provers == phase.upperProvers)
                Assert.assertFalse("expected non-zero provers", provers.isEmpty());
            for (int i = 0; i < provers.size(); i++) {
                var p = provers.get(i);
                var actual = p.prove();
                var msg = String.format("abce test load %s %d/%d: %s, actual: %s, expected: %s",
                        side, i + 1, provers.size(), p.load, actual, expected);
                Assert.assertTrue(msg, expected.contains(actual));
            }
        }
    }

    @Test
    public void test_constant_p() {
        testCommon("constant_p");
    }
    @Test
    public void test_constant_f() {
        testCommon("constant_f");
    }
    @Test
    public void test_param_p() {
        testCommon("param_p");
    }
    @Test
    public void test_param_f() {
        testCommon("param_f");
    }
    @Test
    public void test_param_trans_f() {
        testCommon("param_trans_f");
    }
    @Test
    public void test_loop1_p() {
        testCommon("loop1_p");
    }
    @Test
    public void test_loop1_f() {
        testCommon("loop1_f");
    }
    @Test
    public void test_loop1plus5_p() {
        testCommon("loop1plus5_p");
    }
    @Test
    public void test_loop1plus5_f() {
        testCommon("loop1plus5_f");
    }
    @Test
    public void test_loop1plusc_p() {
        testCommon("loop1plusc_p");
    }
    @Test
    @Ignore("unable to handle non-constant summands")
    public void test_loop1plusc_f() {
        testCommon("loop1plusc_f");
    }
    @Test
    public void test_loop1double_p() {
        testCommon("loop1double_p");
    }
    @Test
    @Ignore("unable to handle multiplication")
    public void test_loop1double_f() {
        testCommon("loop1double_f");
    }
    @Test
    public void test_loop2i_p() {
        testCommon("loop2i_p");
    }
    @Test
    public void test_loop2i_f() {
        testCommon("loop2i_f");
    }
    @Test
    public void test_loop2triangular_p() {
        prepare("loop2triangular_p", ArrayBoundsCheckEliminationTestCases.class);
        Assert.assertEquals(FALSE, phase.upperProvers.get(0).prove());
//        Assert.assertEquals(TRUE, phase.lowerProvers.get(0).prove());
        Assert.assertEquals(TRUE, phase.upperProvers.get(1).prove());
//        Assert.assertEquals(TRUE, phase.lowerProvers.get(1).prove());
    }
    @Test
    public void test_loop2trianglular_f() {
        testCommon("loop2trianglular_f");
    }
    @Test
    public void test_loop2lowertri_p() {
        prepare("loop2lowertri_p", ArrayBoundsCheckEliminationTestCases.class);
        Assert.assertEquals(FALSE, phase.upperProvers.get(0).prove());
//        Assert.assertEquals(TRUE, phase.lowerProvers.get(0).prove());
        Assert.assertEquals(TRUE, phase.upperProvers.get(1).prove());
//        Assert.assertEquals(TRUE, phase.lowerProvers.get(1).prove());
    }
    @Test
    public void test_loop2lowertri_f() {
        testCommon("loop2lowertri_f");
    }
    @Test
    public void test_loop2uppertri_p() {
        testCommon("loop2uppertri_p");
    }
    @Test
    public void test_loop2uppertri_f() {
        testCommon("loop2uppertri_f");
    }
    @Test
    public void test_loop2sum_p() {
        testCommon("loop2sum_p");
    }
    @Test
    @Ignore("unable to handle non-constant summands")
    public void test_loop2sum_f() {
        testCommon("loop2sum_f");
    }
    @Test
    public void test_loop2sumplus5_p() {
        testCommon("loop2sumplus5_p");
    }
    @Test
    @Ignore("unable to handle non-constant summands")
    public void test_loop2sumplus5_f() {
        testCommon("loop2sumplus5_f");
    }
    @Test
    public void test_loop2addmul_p() {
        testCommon("loop2addmul_p");
    }
    @Test
    @Ignore("unable to handle multiplication")
    public void test_loop2addmul_f() {
        testCommon("loop2addmul_f");
    }
//    @Test
//    public void test_bubblesort() {
//        testCommon("bubblesort");
//    }

}
