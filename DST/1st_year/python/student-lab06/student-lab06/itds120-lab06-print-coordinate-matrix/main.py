'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab06-print-coordinate-matrix
 */
'''

n = int(input(""))
x = int(input(""))
y = int(input(""))


for i in range(x+1):
    for j in range(n):
      print(f'({i},{j})', end=' ')
      if i == x and j == y:
        break
    print()


    # print()