sum() {
  paste -s -d+ - | bc
}

bench=bench/2024-05-22T11:33+10:00/

base=$bench/base_big.json
abce=$bench/abce_big.json
unsafe=$bench/unsafe_big.json

csv=( 
$bench/abce_big_metrics/*
  # bench2/2024-05-11T00:11+10:00/abce_scimark_small_metrics.csv 
)
echo "${csv[@]}"
go() {
  bench=$1
  # csv=bench3/abce_scimark_small_metrics.csv
  # cat $csv | grep "$bench" | grep 'ArrayBoundsCheckElimination_'
  elim=$( cat "${csv[@]}" | grep "$bench" | grep HotSpotCompilation | grep 'ArrayBoundsCheckElimination_BoundsCheckUpperRedundant;' | cut -d';' -f6 | sum)
  non=$( cat "${csv[@]}"  | grep "$bench" |grep HotSpotCompilation |  grep -i 'ArrayBoundsCheckElimination_BoundsCheckUpperNonredundant;' | cut -d';' -f6 | sum)

  times=$( cat  "${csv[@]}" | grep "$bench" |grep HotSpotCompilation |  grep 'PhaseTime_ArrayBoundsCheckEliminationPhase_Accm;' | cut -d';' -f6 | sum)
  ce=$( cat  "${csv[@]}" | grep "$bench" |grep HotSpotCompilation |  grep 'PhaseTime_ConditionalEliminationPhase_Accm' | cut -d';' -f6 | sum)

  nodes=$( cat "${csv[@]}"  | grep "$bench" |grep HotSpotCompilation |  grep 'PhaseNodes_ArrayBoundsCheckEliminationPhase;' | cut -d';' -f6 | sum)

  [[ -z "$non" ]] && non=0
  [[ -z "$elim" ]] && elim=0

  echo "% $bench $elim,$non"
  echo $bench ' &'
  basescore=$(cat $base | ./per.py $bench)
  abcescore=$(cat $abce | ./per.py $bench)
  unsafescore=$(cat $unsafe | ./per.py $bench)

  printf '%.2f & ' "$basescore"
  printf '$%+.2f$\%% & ' $(echo "scale=8; $abcescore / $basescore * 100 - 100" | bc)
  printf '$%+.2f$\%% & ' $(echo "scale=8; $unsafescore / $basescore * 100 - 100" | bc)

  echo "$elim + ($non + 0)" | bc
  echo '&'
  echo '$'"$(echo "scale = 4; $elim / ($elim + ($non + 0)) * 100" | bc | xargs printf '%.1f')\$\%" '&'
  echo $nodes '&'
  echo "scale = 0; $times / 1000" | bc
  echo '&'
  echo "scale = 2; $ce / 1000" | bc
  echo '\\'
  echo
}

echo $csv
# go FFT
# go LU
# go SOR
# go SparseCompRow

# go bubbleSort
# go cocktailSort
# go insertSort

go '\.'big_n10_multipleTrue_trans0_transrandomTrue
go '\.'big_n20_multipleTrue_trans0_transrandomTrue
# go '\.'big_n50_multipleTrue_trans0_transrandomTrue
go '\.'big_n10_multipleTrue_trans2_transrandomTrue
go '\.'big_n20_multipleTrue_trans2_transrandomTrue
# go '\.'big_n50_multipleTrue_trans2_transrandomTrue
# go '\.'big_n100_multipleTrue_trans0_transrandomTrue
# go '\.'big_n200_multipleTrue_trans0_transrandomTrue
