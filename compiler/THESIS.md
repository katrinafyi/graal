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
- we need to instrument with metrics.
- we also need to make graphs (charts) and graphs (seafoam).
- after this, we will be ready to start writing and start poster.
- it would be good to at least encode the optimisation in Graal. verification of soundness may be difficult.
