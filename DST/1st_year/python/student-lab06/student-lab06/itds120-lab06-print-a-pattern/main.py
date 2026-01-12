'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab06-print-a-pattern
 */
'''

# YOUR CODE HERE

n = int(input(""))

while n < 2 or n % 2 ==0:
    n = int(input(""))

for i in range(n):
  for j in range(n):
      if i == j or i + j == n - 1 or j==n-1 or j==0:
        print("*", end=" ")
      else:
        print("-", end=" ")
  print()