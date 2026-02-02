import time
from typing import List

# ALGORITHM ANALYSIS IN PYTHON
# ============================


# 1. TIME COMPLEXITY ANALYSIS
# ============================

# O(1) - Constant Time
def get_first_element(arr: List[int]) -> int:
  """Access first element - always takes same time"""
  return arr[0]


# O(n) - Linear Time
def linear_search(arr: List[int], target: int) -> int:
  """Search through array one by one"""
  for i in range(len(arr)):
    if arr[i] == target:
      return i
  return -1


# O(n²) - Quadratic Time
def bubble_sort(arr: List[int]) -> List[int]:
  """Sort by comparing adjacent elements"""
  n = len(arr)
  for i in range(n):
    for j in range(n - i - 1):
      if arr[j] > arr[j + 1]:
        arr[j], arr[j + 1] = arr[j + 1], arr[j]
  return arr


# O(log n) - Logarithmic Time
def binary_search(arr: List[int], target: int) -> int:
  """Search sorted array by dividing in half"""
  left, right = 0, len(arr) - 1
  while left <= right:
    mid = (left + right) // 2
    if arr[mid] == target:
      return mid
    elif arr[mid] < target:
      left = mid + 1
    else:
      right = mid - 1
  return -1


# O(n log n) - Linearithmic Time
def merge_sort(arr: List[int]) -> List[int]:
  """Divide and conquer sorting"""
  if len(arr) <= 1:
    return arr
  
  mid = len(arr) // 2
  left = merge_sort(arr[:mid])
  right = merge_sort(arr[mid:])
  
  return merge(left, right)


def merge(left: List[int], right: List[int]) -> List[int]:
  """Merge two sorted arrays"""
  result = []
  i = j = 0
  while i < len(left) and j < len(right):
    if left[i] <= right[j]:
      result.append(left[i])
      i += 1
    else:
      result.append(right[j])
      j += 1
  result.extend(left[i:])
  result.extend(right[j:])
  return result


# 2. SPACE COMPLEXITY ANALYSIS
# =============================

# O(1) - Constant Space
def sum_array(arr: List[int]) -> int:
  """Uses only a few variables"""
  total = 0
  for num in arr:
    total += num
  return total


# O(n) - Linear Space
def duplicate_array(arr: List[int]) -> List[int]:
  """Creates new array of same size"""
  return arr.copy()


# 3. PERFORMANCE MEASUREMENT
# ==========================

def measure_time(func, *args):
  """Measure execution time of a function"""
  start = time.time()
  result = func(*args)
  end = time.time()
  return result, end - start


# 4. EXAMPLE USAGE
# ================

if __name__ == "__main__":
  test_arr = [64, 34, 25, 12, 22, 11, 90]
  sorted_arr = [11, 12, 22, 25, 34, 64, 90]
  
  print("=== TIME COMPLEXITY EXAMPLES ===")
  print(f"First element: {get_first_element(test_arr)} - O(1)")
  print(f"Linear search: {linear_search(test_arr, 25)} - O(n)")
  print(f"Bubble sort: {bubble_sort(test_arr.copy())} - O(n**2)")
  print(f"Binary search: {binary_search(sorted_arr, 25)} - O(log n)")
  print(f"Merge sort: {merge_sort(test_arr.copy())} - O(n log n)")
  
  print("\n=== PERFORMANCE COMPARISON ===")
  large_arr = list(range(1000, 0, -1))
  
  _, bs_time = measure_time(bubble_sort, large_arr.copy())
  _, ms_time = measure_time(merge_sort, large_arr.copy())
  print(f"Bubble Sort (1000 elements): {bs_time:.6f}s")
  print(f"Merge Sort (1000 elements): {ms_time:.6f}s")
  # print(f"Merge Sort is {bs_time/ms_time:.1f}x faster")