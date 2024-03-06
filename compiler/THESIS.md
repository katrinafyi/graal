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
