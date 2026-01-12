'''
/**
USERID: 
PASSWORD: 
EXERCISEID: checkpoint 4
*/
'''
import numpy as np

def pad_func(arr, pad):
  padded_arr = np.zeros(len(arr) + pad, dtype=int)
  for i in range(len(arr)):
    padded_arr[i] = arr[i]
  return padded_arr

arr1 = input().split()
arr2 = input().split()
a1 = np.array(arr1, dtype=int)
a2 = np.array(arr2, dtype=int)

if len(arr1) < len(arr2):
  a1 = pad_func(arr1, len(arr2)-len(arr1))

size = len(a1) - len(a2) + 1
out = np.zeros(size, dtype=int)
for i in range(size):
  sub_array = a1[i:i+len(a2)]
  out[i] = np.sum(np.multiply(sub_array, a2))

print(out)