# thesis notes
<!-- vim: set textwidth=80 wrap : -->

2024-02-28 week 2 meeting: ian suggests operating at the higher level.  this
could look like treating the "LoadIndexed" node, which lowers into a floating
Guard node.  we could also implement a simple translation to add an If or a
Guard which performs this check explicitly.  hopefully, this would get
eliminated by later conditional elimination.  regardless, we have no excuse to
be stuck.


