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
import org.junit.Test;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("unused")
public class ArrayBoundsCheckEliminationPiTests extends GraalCompilerTest {
    List<LoadIndexedNode> loads;
    ArrayBoundsCheckEliminationPhase phase;
    private void prepare(String testMethod) {
        ResolvedJavaMethod meth = getResolvedJavaMethod(ArrayBoundsCheckEliminationPiTests.class, testMethod);
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
        Assert.assertEquals(1, phase.provers.size());
        Assert.assertEquals(1, loads.size());
        var load = loads.get(0);
        var prover = phase.provers.get(0);
        Assert.assertEquals("pi correctness two_if", pi(pi(load.index())), prover.resolveNode(load.index()));
        Assert.assertEquals("elimination two_if", ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.True, prover.prove(load.index(), -1));
    }
    @Test
    public void test_one_if() {
        prepare("one_if");
        System.out.println(phase.provers);
        Assert.assertEquals(1, phase.provers.size());
        Assert.assertEquals(1, loads.size());
        var load = loads.get(0);
        var prover = phase.provers.get(0);
        Assert.assertEquals("pi one_if", pi(load.index()), prover.resolveNode(load.index()));
        Assert.assertEquals("non-elimination two_if", ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.False, prover.prove(load.index(), -1));
    }

    private int array_two_load(int i, int[] a, boolean b) {
        int s = a[i];
        if (b) s += a[i];
        return s;
    }

    @Test
    public void test_array_two_load() {
        prepare("array_two_load");
        System.out.println(phase.provers);
        Assert.assertEquals(2, phase.provers.size());
        Assert.assertEquals(2, loads.size());
        var load = loads.get(0);
        var prover = phase.provers.get(1);
        Assert.assertEquals("pi array_load second load", pi(load.index()), prover.resolveNode(load.index()));
        Assert.assertEquals("elimination array_two_load " + prover, ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.True, prover.prove(load.index(), -1));
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
        System.out.println(phase.provers);
        Assert.assertEquals(4, phase.provers.size());
        for (int i = 0; i < phase.provers.size(); i++) {
            var p = phase.provers.get(i);
            Assert.assertEquals("redundant: " + p.load, ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.Reduced, p.prove(p.load.index(), -1));
        }
    }

    public static int constant_f(int[] a) {
        if (!(10 < a.length))
            return -1;
        return a[5];
    }

    @Test
    public void test_constant() {
        prepare("constant_f");
        System.out.println(phase.provers);
        Assert.assertEquals(1, phase.provers.size());
        for (int i = 0; i < phase.provers.size(); i++) {
            var p = phase.provers.get(i);
            Assert.assertEquals("redundant: " + p.load, ArrayBoundsCheckEliminationPhase.DemandProver.Lattice.True, p.prove(p.load.index(), -1));
        }
    }

}
