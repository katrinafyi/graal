#!/bin/bash

set -e

mx --components=cmp build

nohup bash -c "
mx -d unittest -Dgraal.Dump=:2 -Djdk.graal.Dump \
-Djdk.graal.PrintGraph=Network --no-eager-stacktrace \
--color -Dgraal.MethodFilter=ArrayBoundsCheckEliminationTestCases.'*' \
ArrayBoundsCheckEliminationTest \
|| \
kill -HUP $$
"

while ! nc -z localhost 8000; do printf . ; sleep 0.3; done
