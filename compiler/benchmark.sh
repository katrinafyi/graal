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
  rm -rf aggmetrics.csv metrics.csv
  mx benchmark jmh-dist:GRAAL_COMPILER_MICRO_BENCHMARKS \
    -- -Dgraal.Count -Dgraal.DebugABCE=false $arg --jvm-config=graal-core -Dgraal.TrackNodeSourcePosition=true -Dgraal.AggregatedMetricsFile=aggmetrics.csv -Dgraal.MetricsFile=metrics.csv -Dgraal.Time -Dgraal.Count \
       -Dgraal.GraalCompileOnly='SortingBenchmark.*' \
    -- SortingBenchmark.cocktail
  mv -v jmh_result.json bench/$t/${mode}_micro.json
  cp aggmetrics.csv bench/$t/${mode}_micro.csv
  cp metrics.csv bench/$t/${mode}_micro_metrics.csv

  rm -rf aggmetrics.csv metrics.csv
  mx benchmark jmh-dist:GRAAL_COMPILER_MICRO_BENCHMARKS \
    -- -Dgraal.Count -Dgraal.DebugABCE=false $arg --jvm-config=graal-core -Dgraal.TrackNodeSourcePosition=true -Dgraal.AggregatedMetricsFile=aggmetrics.csv -Dgraal.MetricsFile=metrics.csv -Dgraal.Time -Dgraal.Count  \
       -Dgraal.GraalCompileOnly='SortingBenchmark.*' \
    -- ArrayHashCodeBenchmark
  mv -v jmh_result.json bench/$t/${mode}_hashcode.json
  cp aggmetrics.csv bench/$t/${mode}_hashcode.csv
  cp metrics.csv bench/$t/${mode}_hashcode_metrics.csv

  rm -rf aggmetrics.csv metrics.csv
  SPECJVM2008=~/Downloads/SPECjvm2008 mx benchmark \
    specjvm2008:scimark.sor.small,scimark.fft.small,scimark.lu.small,scimark.sparse.small \
    -- -Dgraal.Count -Dgraal.DebugABCE=false $arg --jvm-config=graal-core \
       -Dgraal.GraalCompileOnly='SOR.*,FFT.*,LU.*,SparseCompRow.*' -Dgraal.TrackNodeSourcePosition=true \
       -Dgraal.AggregatedMetricsFile=aggmetrics.csv -Dgraal.MetricsFile=metrics.csv -Dgraal.Time -Dgraal.Count  \
    -- -ikv
  result=$(printf '%s\n' ~/Downloads/SPECjvm2008/results/SPEC* | sort | tail -n1)
  mv -v $result bench/$t/${mode}_scimark_small
  cp aggmetrics.csv bench/$t/${mode}_scimark_small.csv
  cp metrics.csv bench/$t/${mode}_scimark_small_metrics.csv

done


