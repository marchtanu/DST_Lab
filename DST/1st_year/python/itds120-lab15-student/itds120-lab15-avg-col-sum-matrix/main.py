'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab15-avg-col-sum-matrix
*/
'''
# Your Python code goes here
import numpy as np

row , column = input().split()
path = 'matrix.txt'
f = open(path, 'r')
fd = open(path, 'r')
file_line = len(fd.readlines())
list_matrix = []
for _ in range(file_line):
    list_matrix.append(f.readline().split())
matrix = []

for i in range(int(row)):
    row_list = []
    for j in range(int(column)):
        row_list.append(list_matrix[i][j])
    matrix.append(row_list)

matrix = np.array(matrix,dtype=np.int8)
print(matrix)
print(np.mean(matrix, axis=0))
print(np.mean(matrix, axis=1))
f.close()
fd.close()