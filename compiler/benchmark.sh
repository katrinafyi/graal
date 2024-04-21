#!/bin/bash -ex

modes=(base abce unsafe)
args=(
  "-Dgraal.DisableABCE=true -Dgraal.UnsafeABCE=false"
  "-Dgraal.DisableABCE=false -Dgraal.UnsafeABCE=false"
  "-Dgraal.DisableABCE=false -Dgraal.UnsafeABCE=true"
)

t="$(date -Iminutes)"
mkdir -p bench/$t
echo bench/$t
for i in "${!modes[@]}"; do
  mode=${modes[$i]}
  arg=${args[$i]} 
  echo $i $mode
  mx benchmark jmh-dist:GRAAL_COMPILER_MICRO_BENCHMARKS \
    -- -Dgraal.DebugABCE=false $arg --jvm-config=graal-core \
    -- ArrayHashCodeBenchmark
  mv -v jmh_result.json bench/$t/${mode}_hashcode.json

  SPECJVM2008=~/Downloads/SPECjvm2008 mx benchmark \
    specjvm2008:scimark.sor.small,scimark.fft.small,scimark.lu.small,scimark.sparse.small \
    -- -Dgraal.DebugABCE=false $arg --jvm-config=graal-core \
       -Dgraal.GraalCompileOnly='SOR.*,FFT.*,LU.*,SparseCompRow.*' \
    -- -ikv
  result=$(printf '%s\n' ~/Downloads/SPECjvm2008/results/SPEC* | sort | tail -n1)
  mv -v $result bench/$t/${mode}_sor_small

done


