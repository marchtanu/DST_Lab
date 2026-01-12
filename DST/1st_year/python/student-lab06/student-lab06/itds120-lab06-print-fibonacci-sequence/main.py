'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab06-print-fibonacci-sequence
 */
'''

# YOUR CODE HERE
x = int(input(""))
f = 0
f1 = 1

for i in range(1,x+1):
    print(f, end=" ")
    f_n = f + f1
    f = f1
    f1 = f_n
    if i % 5 == 0 and i != 0:
        print("")
# arr = [0, 1]

# for i in arr:
#     if len(arr) < x:
#         arr.append(arr[-1] + arr[-2])
#     print(i, end=" ")




