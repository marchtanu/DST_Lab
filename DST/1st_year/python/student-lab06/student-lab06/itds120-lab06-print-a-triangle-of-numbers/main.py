'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab06-print-a-triangle-of-numbers
 */
'''

# YOUR CODE HERE

n = int(input(""))

while n < 1:
    n = int(input(""))

for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(i, end=" ")
    print()
