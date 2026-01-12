'''
/**
USERID: XXX
PASSWORD: XXX
EXERCISEID: itds120-lab03-calculate-bmi
 */
'''

# YOUR CODE HERE

A = [[] for _ in range(3)]

print(A)

n =int(input())

a_list = []
b_list = []
c_list = []

for _ in range(n):
    x = []
    for __ in range(n):
     a_member = int(input())
     x.append(a_member)
    a_list.append(x)

for _ in range(n):
    x = []
    for __ in range(n):
     b_member = int(input())
     x.append(b_member)
    b_list.append(x)

for _ in range(n):
    x = []
    for __ in range(n):
     x.append(0)
    c_list.append(x)

for i in range(n):
   for j in range(n):
      for k in range(n):
         c_list[i][j] += a_list[i][k] * b_list[k][j]

print(a_list)
print(b_list)
print(c_list)





