'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab06-print-a-triangle-of-stars
 */
'''

# YOUR CODE HERE

m = int(input(""))

for i in range(m):
  print("-" * (m - i - 1) + "*" * (2 * i + 1) + "-" * (m - i - 1))
# End of your code