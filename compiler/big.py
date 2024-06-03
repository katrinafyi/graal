#!/usr/bin/env python3
# vim: ts=2 sts=2 sw=2 et

import random

from collections import deque
from itertools import islice

def window(seq, n=2):
    "Returns a sliding window (of width n) over data from the iterable"
    "   s -> (s0,s1,...s[n-1]), (s1,s2,...,sn), ...                   "
    it = iter(seq)
    result = tuple(islice(it, n))
    if len(result) == n:
        yield result
    for elem in it:
        result = result[1:] + (elem,)
        yield result

arrays = set()
transitives = set()
def go(n: int, multiple: bool, trans: int, transrandom: bool):

  def nth(i):
    """Returns i-th array variable."""
    if multiple: return f'a{i}'
    else: return 'a'

  def transth(i):
    """Returns i-th transitivity array variable, assumed to be of length 'trans'."""
    if multiple: return f'trans{i}'
    else: return 'trans'


  transes = set()
  prelude = ['int s = 0;']
  left = []
  right = []

  random.seed(0xbee4)

  for i in range(n):
    ith = f'i{i}'
    ath = nth(i)
    tth = transth(i)

    arrays.add(ath)
    transitives.add(tth)

    if tth not in transes:
      transes.add(tth)
      prelude.append(f'if (!({tth}.length >= {trans})) return -1;')
      for t in range(trans):
        prelude.append(f'int {tth}_{t} = {tth}[{t}];')

    tr = []
    for t in range(trans):
      tr.append(f'{tth}_{t}')
    tr.append(f'{ath}.length')

    ineqs = [f'{l} <= {r}' for l,r in window(tr)]
    if transrandom:
      random.shuffle(ineqs)

    for ineq in ineqs:
      left.append(f'if ({ineq})')
    left.append(f'for (int {ith} = 0; {ith} < 1 && {ith} < {tr[0]}; {ith}++) {{')

    right.append('}')

  fn = f'big_{n=}_{multiple=}_{trans=}_{transrandom=}'.replace('=','')
  # print(fn)

  # force execution to proceed to this point.
  def generator():

    yield f'int {fn}() {{'
    yield from prelude
    yield from left
    for i in range(n):
      yield (f's += {nth(i)}[i{i}];')
    yield from reversed(right)
    yield ('return s; }')

    yield ''
    yield (f'@Benchmark public int bench_{fn}() {{')
    yield (f'return {fn}();')
    yield ('}')
    yield ''

  return generator()

def setup():
  yield from ['@Setup public void setup() throws Exception {']
  yield ('int N = 10000;')
  yield ('var random = ThreadLocalRandom.current();')
  yield ('IntUnaryOperator fill = i -> random.nextInt();')
  yield ('IntUnaryOperator fillTrans = i -> (int)(i / N + 1);')
  for i in sorted(arrays):
    yield (f'{i} = new int[N];');
    yield (f'Arrays.setAll({i}, fill);')
  for i in sorted(transitives):
    yield (f'{i} = new int[N];');
    yield (f'Arrays.setAll({i}, fillTrans);')
  yield ('}')
  yield ('')

def fields():
  yield from (f'private int[] {i};' for i in sorted(arrays | transitives))
  yield ''

def genprint(generator):
  for x in generator:
    print(x)

if __name__ == '__main__':
  # print(*go(2, True, 2, True), sep='\n')
  # raise 2

  body = []
  body.append(go(10, True, 0, True))
  body.append(go(20, True, 0, True))
  body.append(go(50, True, 0, True))
  body.append(go(100, True, 0, True))
  body.append(go(200, True, 0, True))


  body.append(go(10, True, 2, True))
  body.append(go(20, True, 2, True))
  body.append(go(50, True, 2, True))
  body.append(go(100, True, 2, True))
  body.append(go(200, True, 2, True))

  body.append(go(200, True, 1, True))
  # body.append(go(200, True, 2, True))
  body.append(go(200, True, 5, True))
  body.append(go(200, True, 10, True))

  # body.append(go(1000, True, 0, False))
  # body.append(go(2000, True, 0, False))
  # body.append(go(200, True, 20, True))
  # body.append(go(1000, True, 20, True))
  # body.append(go(2000, True, 20, True))
  #
  # body.append(go(500, True, 50, True))
  # body.append(go(500, True, 200, True))
  # body.append(go(500, True, 500, True))

  print('''package micro.benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntUnaryOperator;

@State(Scope.Thread)
public class BigBenchmark extends BenchmarkBase {''')

  genprint(fields())
  genprint(setup())
  for b in body:
    genprint(b)

  print('\n}')

