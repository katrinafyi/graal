#!/usr/bin/env python3

import sys
import json

test = sys.argv[1]

d = json.load(sys.stdin)
for data in d: 
    if test.replace('Sort', '') in data['benchmark'].split('.')[-1]:
        print(data['primaryMetric']['score'])

