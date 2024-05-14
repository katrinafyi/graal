sum() {
  paste -s -d+ - | bc
}

csv=bench2/2024-05-11T00:11+10:00/abce_scimark_small_metrics.csv 
go() {
  bench=$1
  # csv=bench3/abce_scimark_small_metrics.csv
  # cat $csv | grep "$bench" | grep 'ArrayBoundsCheckElimination_'
  elim=$( cat $csv | grep "$bench" | grep 'ArrayBoundsCheckElimination_BoundsCheckUpperRedundant;' | cut -d';' -f6 | sum)
  non=$( cat $csv | grep "$bench" | grep 'ArrayBoundsCheckElimination_BoundsCheckUpperNonredundant;' | cut -d';' -f6 | sum)

  times=$( cat $csv | grep "$bench" | grep 'PhaseTime_ArrayBoundsCheckEliminationPhase_Accm;' | cut -d';' -f6 | sum)

  echo $bench $elim $non
  echo "scale = 4; $elim / ($elim + $non)" | bc
  echo "scale = 0; $times / 1000" | bc
}

echo $csv
go FFT
go LU
go SOR
go SparseCompRow

