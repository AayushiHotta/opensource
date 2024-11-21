#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'missingNumbers' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY arr
#  2. INTEGER_ARRAY brr
#

def missingNumbers(arr, brr):
    freq_arr = {}
    freq_brr = {}
    
    for num in arr:
        freq_arr[num] = freq_arr.get(num,0)+1
    
    for num in brr:
        freq_brr[num] = freq_brr.get(num,0)+1
    
    missing = []
    for num in freq_brr:
        if num not in freq_arr or freq_brr[num] > freq_arr[num]:
            missing.append(num)
            
    return sorted(missing)



n = int(input())

arr = list(map(int, input().split()))

m = int(input())

brr = list(map(int, input().split()))

missing = missingNumbers(arr, brr)

print(" ".join(map(str, missing)))
