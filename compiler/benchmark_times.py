#!/usr/bin/env python3
# vim: sw=2 ts=2 sts=2 et

'''

generates plots of Graal benchmark results.

requires a single argument pointing to folder within bench/.

assumes the folder has been created by the benchmark.sh script.

'''

import os
import sys
import json
import statistics
import dataclasses
from typing import Generator
import numpy as np
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import matplotlib.colors
from pathlib import Path
from collections import defaultdict


assert len(sys.argv) > 1

d = Path(sys.argv[1])
print(f'{d=}')


# jmh_suites = {'micro', 'hashcode', 'big'}
jmh_suites = {'big'}
specjvm_suites = {'scimark'}
modes = ['base', 'abce', 'unsafe']

@dataclasses.dataclass
class Result:
  benchmark: str
  test: str
  result: float
  unit: str
  mode: str = 'UNKNOWN'

def parse_jmh(p: Path) -> Generator[Result, None, None]:
  with open(p) as f:
    data = json.load(f)
  for x in data:
    benchmark, test = x['benchmark'].split('.')[-2:]
    yield Result(benchmark, test, x['primaryMetric']['score'], x['primaryMetric']['scoreUnit'])

def parse_specjvm(p: Path) -> Generator[Result, None, None]:
  assert p.is_dir()
  with open(list(p.glob('SPEC*.txt'))[0]) as f:
    data = f.read().split('---------------')[-1].split('\n\n')[:-1]
    for row in data:
      if not row.strip(): continue
      row = row.split('\n')[-1]
      bench = 'scimark'
      test = row.split()[0]
      result = float(row.split()[-1])
      unit = 'ops/min'
      yield Result(bench, test, result, unit)

allresults = []
for f in d.glob('*'):
  print(f)
  if f.suffix == '.csv' or f.name.endswith('_metrics'): continue
  terms = f.stem.split('_')
  print(terms)
  results = []
  if any(t in specjvm_suites for t in terms):
    results = (parse_specjvm(f))
  elif any(t in jmh_suites for t in terms):
    results = (parse_jmh(f))
  mode = next(iter(x for x in terms if x in modes))
  allresults += (dataclasses.replace(x, mode=mode) for x in results)

# print(allresults)

name_map = defaultdict(str, {
  'scimark.fft.small': 'FFT',
  'scimark.lu.small': 'LU',
  'scimark.sor.small': 'SOR',
  'scimark.sparse.small': 'Sparse',
  'selection': 'Selection',
  'cocktail': 'Cocktail',
  'insert': 'Insertion',
  'bubble': 'Bubble',
})

def translate_name(x):
  # if x in name_map: return name_map[x]
  if x.startswith('bench_big'):
    n = ([y for y in x.split('_') if y.startswith('n') and y[1].isdigit()][0][1:])
    trans = ([y for y in x.split('_') if y.startswith('trans') and y[5].isdigit()][0][5:])
    print(x, n, trans)
    return n, trans

  return (None,None)


df = pd.DataFrame(vars(x) for x in allresults)
df = df.sort_values(by='mode', key=lambda x: x.map(modes.index)).reset_index(drop=True)
df['n'] = df['test'].map(lambda x: translate_name(x)[0])
df['trans'] = df['test'].map(lambda x: translate_name(x)[1])
df['x'] = 'n=' + df['n'] + ', trans=' + df['trans']
df = (df.sort_values(by=['trans']))
df = df.reset_index(drop=True)
df['mode'] = list(map(lambda x: str(x).title() if str(x) != 'abce' else 'ABCE', df['mode']))

print(df)
plt.style.use('./tex.mplstyle')
plt.figure(figsize=(3.5,3))
# plt.yscale('log')
# plt.xticks(rotation=45)


d = df.loc[
    (df['benchmark'] == 'BigBenchmark') & (df['x'].str.contains('trans=0') | df['x'].str.contains('trans=2'))
    & df['trans'] == 0
    ]

print(d)

# g = sns.FacetGrid(d, col="trans", row='n')
# g.map(sns.barplot, 'x', 'result')

ax1 = sns.barplot(data=d, x='x', y='result', hue='mode', hue_order=['Base', 'ABCE', 'Unsafe'])

# ax2 = plt.twinx()
# sns.barplot(ax=ax2, data=df.loc[df['unit'] == 'ops/min'], x='x', y='result', hue='mode')
plt.xlabel('')
plt.ylabel('benchmark result (ops/s)')
plt.title('Sorting Benchmarks')
plt.legend(loc='lower left', framealpha=1)

# ax2 = ax1.twinx()
# ax2 = sns.barplot(data=df.loc[(df['unit'] == 'ops/s')], x='x', y='result', hue='mode', hue_order=['Base', 'ABCE', 'Unsafe'])
# plt.show()

plt.savefig('fig.pdf', bbox_inches='tight')

sys.exit()


fig, ax = plt.subplots(figsize=(4,4))
# ax.set_yscale('log')
ax.set_xscale('log')
ax.set_box_aspect(1)
ax.set_ylabel(r'$\text{time (s)}$')
ax.set_xlabel(r'$\text{code (lines, logarithmic)}$')


def rand_jitter(arr):
  stdev = 1
  return arr + np.random.randn(len(arr)) * stdev

groupings = [
  ('vector', 'tab:purple'),
  ('integer', 'tab:cyan'),
  ('memory', 'tab:green'),
  ('branch', 'tab:orange'),
  ('', 'tab:grey')
]

seen = set()
for key,colour in groupings:
  colour = matplotlib.colors.to_rgba('tab:purple', 0.6)
  new = {k for k in times if k not in seen and k.replace('aarch64_', '').startswith(key)}
  seen |= new

  xs = [x[1] for k,x in times.items() if k in new]
  ys = [x[0] for k,x in times.items() if k in new]
  ax.scatter((xs), ys, s=20, marker='o', color=colour, edgecolor='none')

for k,(t,l) in times.items():
  if t >= 40 or 'A64' in k  or l >= 10**4:
    k = k.split('.')[0]
    yshift = -3 if '_wb' in k else 2 # XXX hack! _wb appears below and needs a bit more space.
    shift = (-5,yshift) if k != 'decode_tests' else (10, -10)
    ax.annotate(r'$\verb|' + k + '|$', (l,t),
                xytext=shift, textcoords='offset points',
                ha='right',
                va='center',
                fontsize=9)
    ax.scatter([l],[t],s=40, marker='o', facecolors='none', edgecolors='black', linewidth=0.5)

plt.savefig('fig/cpp_times.pdf')

print(f'{statistics.median(x[0] for x in times.values())=}')
