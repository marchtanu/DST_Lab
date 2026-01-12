'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab06-find-prime-numbers
 */
'''

# YOUR CODE HERE
# n = int(input(""))
# count = 0
# while  n < 2 or n >= 1000:
#     n = int(input(""))

# for num in range(2, n + 1):
#     is_prime = True
#     for i in range(2, int(num**0.5) + 1):
#         if num % i == 0:
#             is_prime = False
#             break
#     if is_prime:
#         print(num, end=' ')
#         count += 1
    

# print()
# print(f'Total prime numbers: {count}')

h = int(input())
z = int(input())

k = 2 * (h - 1)
w = k * z + 1

for i in range(h):
  for j in range(w):
    if (j % k == i) or (j % k == k - i):
      print("*", end="")
    else:
      print(" ", end="")
  print()
