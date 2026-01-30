# RECURSION BASICS
# A function that calls itself until a base case is reached

# 1. SIMPLE RECURSION - Countdown
def countdown(n):
  """Base case stops the recursion"""
  if n == 0:  # Base case
    print("Done!")
    return
  print(n)
  countdown(n - 1)  # Recursive call

# countdown(5)


# 2. FACTORIAL - Classic Example
def factorial(n):
  """Calculate n! = n × (n-1) × ... × 1"""
  if n == 1:  # Base case
    return 1
  return n * factorial(n - 1)  # Recursive case

# print(factorial(5))  # Output: 120


# 3. FIBONACCI SEQUENCE
def fibonacci(n):
  """0, 1, 1, 2, 3, 5, 8, 13..."""
  if n <= 1:  # Base case
    return n
  return fibonacci(n - 1) + fibonacci(n - 2)

# print(fibonacci(6))  # Output: 8


# 4. SUM OF LIST
def sum_list(lst):
  """Add all numbers in a list"""
  if len(lst) == 0:  # Base case
    return 0
  return lst[0] + sum_list(lst[1:])  # Recursive case

# print(sum_list([1, 2, 3, 4, 5]))  # Output: 15


# 5. BINARY SEARCH
def binary_search(arr, target, left, right):
  """Find target in sorted array"""
  if left > right:  # Base case: not found
    return -1
  
  mid = (left + right) // 2
  if arr[mid] == target:  # Base case: found
    return mid
  elif arr[mid] > target:
    return binary_search(arr, target, left, mid - 1)
  else:
    return binary_search(arr, target, mid + 1, right)

# print(binary_search([1, 3, 5, 7, 9], 7, 0, 4))  # Output: 3


# KEY POINTS:
# ✓ Base case: Stops recursion (must have!)
# ✓ Recursive case: Function calls itself with smaller input
# ✓ Call stack: Each call is stored in memory
# ✓ Time complexity: Can be inefficient without optimization
# ✓ Memoization: Cache results to improve performance

# MEMOIZATION EXAMPLE (Optimization)
def fib_memo(n, memo={}):
  """Optimized Fibonacci using caching"""
  if n in memo:  # Check cache
    return memo[n]
  if n <= 1:
    return n
  memo[n] = fib_memo(n - 1, memo) + fib_memo(n - 2, memo)
  return memo[n]

# print(fib_memo(10))  # Much faster!