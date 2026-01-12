'''
/**
USERID: 
PASSWORD: 
EXERCISEID: 
*/
'''

# TODO#1 - รับข้อมูล 2D Array
# คำใบ้:
#   1. อ่านค่าจาก input() แถวแรกเพื่อรับขนาดของ array (row, col)
#   2. ใช้ลูป for เพื่ออ่านข้อมูลแต่ละแถว
#   3. แปลงข้อมูลเป็น int และเก็บใน list
#   4. สร้าง numpy array จาก list ที่ได้
# Your Python code goes here
import numpy as np
row, column = input().split()
row, column = int(row), int(column)
data = [input().split() for _ in range(row)]
matrix = np.array(data, dtype=int)

# TODO#2 - รับค่า threshold
# Your Python code goes here
threshold = int(input())

# TODO#3 - ลบแถวที่มีค่ามากที่สุดของแถวนั้นน้อยกว่า threshold
# คำใบ้:
#   1. ใช้ np.max() ที่ระบุ axis=1 เพื่อหา max ของแต่ละแถว
#   2. สร้าง boolean mask โดยเปรียบเทียบกับ threshold
#   3. ใช้ boolean mask เพื่อเลือกแถวที่ต้องการเก็บไว้
# Your Python code goes here
max_values = np.max(matrix, axis=1)
mask = max_values >= threshold
matrix = matrix[mask]

# TODO#4 - แสดงผลลัพธ์
# Your Python code goes here

print(matrix)