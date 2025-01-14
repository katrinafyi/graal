# thesis notes
<!-- vim: set textwidth=80 wrap : -->

2024-02-28 week 2 meeting: ian suggests operating at the higher level.  this
could look like treating the "LoadIndexed" node, which lowers into a floating
Guard node.  we could also implement a simple translation to add an If or a
Guard which performs this check explicitly.  hopefully, this would get
eliminated by later conditional elimination.  regardless, we have no excuse to
be stuck.

2024-02-29 we can make intellij wait for an open debug connection:
    bash -c 'while ! nc -z localhost 8000; do printf . ; sleep 1; done'
and it can build as well
    time /home/rina/progs/mx/mx --components=cmp build && time /home/rina/progs/mx/mx -d unittest -Dgraal.Dump=:2 -Djdk.graal.Dump -Djdk.graal.PrintGraph=Network --no-eager-stacktrace --color -Dgraal.MethodFilter=ArrayBoundsCheckEliminationTestCases.'*' ArrayBoundsCheckEliminationTest
this can be sequenced by a compound action to run in parallel,
and a "before launch" action to put the loop before GraalDebug.

let's use the real cfg...

2024-03-06 week 3 meeting: dacapo benchmark is the easiest to run - brae
use dominator tree... somehow?

2024-03-13 how do you eliminate bounds checks that do not exist?? we will need to do if node creation...

2024-03-20 Ian: write lots of details about approaches tried otherwise this will be forgotten. working on pi node algorithms for essa generation and trying to avoid explicit creation of pi nodes

2024-04-02 omitting pi nodes has failed spectacularly. although the inequalities
in isolation should be equivalent, the algorithm relies on handling phi and
non-phi variables differently. omitting pi nodes means some variables are
incorrectly pointing to phis when they should not be.

we are making progress, but there is a problem with the reduced loop detection.
the graph matches very closely with the paper example, but the logic is wrong i
believe.

2024-04-12: we have working pi node virtualisation and passing the example.
we need to propagate this information to the lowering phase, e.g. by an
attribute on LoadIndexed. we also need to implement more tests, including some
which might fail.

to do:
- handling of inequalities between constants
- lower bounds checks???
- benchmarking.

2024-04-24: 
- we need to instrument with metrics: https://github.com/oracle/graal/blob/master/compiler/docs/OptimizationLog.md
- we also need to make graphs (charts) and graphs (seafoam).
- after this, we will be ready to start writing and start poster.
- it would be good to at least encode the optimisation in Graal. verification of soundness may be difficult.
- also: investigate stamping of array length node and constant-bounded loop.
  - A: we find that stamps can only represent context-insensitive facts (i.e. facts which are always true of the node). this prevents it from considering information gleaned via conditions.
  - A2: this is in addition to their inability to be bounded by array length values (which are not constant).

2024-05-20:
- q: does the most trivial of redundant bounds check get eliminated? (i.e. that with exactly the correct guard preceding it)
    - a: for constant indices, yes. it appears that this also holds for runtime-but-not-compile-constant indices. this is only done after high tier lowering -> floating read -> iterative cond elim.
- q: does it handle repeated bounds checks?
- i surmise that cache locality has is a strong factor. in the case of sparse/jagged matrices, the need to load memory for bounds checks is significant. maybe we can simulate this by generating many distinct arrays.
  ```java
  int t1 = ...; // for transitivity, from external source. possibly use transitivity array with appropriate assertions, to support testing variable transitivity lengths.
  if (t1 <= a1.length) // pos 1
  for (int i1 = 0; i1 < 1 && i1 < t1; i1++) {
  if (t1 <= a1.length) // pos2
  for (int i2 = 0; i2 < 1 && i2 < a2.length; i2++) {
    a1[i1] + a2[i2] + ...;
  }
  }
  ```
  vary: multiple arrays vs single array.
  vary: transitivity? possibly by introducing a array of transitive variables for each array. we can very number of transitive elements.
  vary: number of bounds checks.

2024-05-22:
- need to rerun benchmarks with disable loop unrolling (!)
