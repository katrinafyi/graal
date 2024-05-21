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
  rm -rf aggmetrics-*.csv metrics-*.csv
  mx benchmark jmh-dist:GRAAL_COMPILER_MICRO_BENCHMARKS \
    -- -Dgraal.Count -Dgraal.DebugABCE=false $arg --jvm-config=graal-core -Dgraal.TrackNodeSourcePosition=true -Dgraal.AggregatedMetricsFile=aggmetrics.csv -Dgraal.MetricsFile=metrics.csv -Dgraal.Time -Dgraal.Count \
       -Dgraal.GraalCompileOnly='SortingBenchmark.*' \
    -- SortingBenchmark
  mv -v jmh_result.json bench/$t/${mode}_micro.json
  mkdir -p bench/$t/${mode}_metrics
  cp metrics-*.csv aggmetrics-*.csv bench/$t/${mode}_metrics

  rm -rf aggmetrics.csv metrics.csv
  rm -rf aggmetrics-*.csv metrics-*.csv
  mx benchmark jmh-dist:GRAAL_COMPILER_MICRO_BENCHMARKS \
    -- -Dgraal.Count -Dgraal.DebugABCE=false $arg --jvm-config=graal-core -Dgraal.TrackNodeSourcePosition=true -Dgraal.AggregatedMetricsFile=aggmetrics.csv -Dgraal.MetricsFile=metrics.csv -Dgraal.Time -Dgraal.Count \
       -Dgraal.GraalCompileOnly='BigBenchmark.*' \
    -- BigBenchmark
  mv -v jmh_result.json bench/$t/${mode}_big.json
  mkdir -p bench/$t/${mode}_metrics
  cp metrics-*.csv aggmetrics-*.csv bench/$t/${mode}_metrics

  rm -rf aggmetrics.csv metrics.csv
  rm -rf aggmetrics-*.csv metrics-*.csv
  mx benchmark jmh-dist:GRAAL_COMPILER_MICRO_BENCHMARKS \
    -- -Dgraal.Count -Dgraal.DebugABCE=false $arg --jvm-config=graal-core -Dgraal.TrackNodeSourcePosition=true -Dgraal.AggregatedMetricsFile=aggmetrics.csv -Dgraal.MetricsFile=metrics.csv -Dgraal.Time -Dgraal.Count  \
       -Dgraal.GraalCompileOnly='ArrayHashCodeBenchmark.*' \
    -- ArrayHashCodeBenchmark
  mv -v jmh_result.json bench/$t/${mode}_hashcode.json
  mkdir -p bench/$t/${mode}_metrics
  cp metrics-*.csv aggmetrics-*.csv bench/$t/${mode}_metrics

  export SPECJVM2008=~/Downloads/SPECjvm2008
  rm -rf $SPECJVM2008/{aggmetrics.csv,metrics.csv}
  rm -rf $SPECJVM2008/aggmetrics-*.csv $SPECJVM2008/metrics-*.csv
  mx benchmark \
    specjvm2008:scimark.sor.small,scimark.fft.small,scimark.lu.small,scimark.sparse.small \
    -- -Dgraal.Count -Dgraal.DebugABCE=false $arg --jvm-config=graal-core \
       -Dgraal.GraalCompileOnly='SOR.*,FFT.*,LU.*,SparseCompRow.*' -Dgraal.TrackNodeSourcePosition=true \
       -Dgraal.AggregatedMetricsFile=aggmetrics.csv -Dgraal.MetricsFile=metrics.csv -Dgraal.Time -Dgraal.Count  \
    -- -ikv
  result=$(printf '%s\n' ~/Downloads/SPECjvm2008/results/SPEC* | sort | tail -n1)
  mv -v $result bench/$t/${mode}_scimark_small
  mkdir -p bench/$t/${mode}_metrics
  cp $SPECJVM2008/metrics-*.csv $SPECJVM2008/aggmetrics-*.csv bench/$t/${mode}_metrics

done


