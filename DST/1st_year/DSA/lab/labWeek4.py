binary_matrix1 = [
    [1,1,0,0,1],
    [0,1,1,0,0],
    [0,0,0,0,1],
    [1,0,0,1,1],
    [1,0,1,1,1]
]
ez_matrix = [
    [1,1,0],
    [1,1,0],
    [0,0,0]
]


def countM(n):
    _x = range(len(n[0]))
    _y = range(len(n))
    _c = []
    checked = set()
    for loc_y in _y:
        c = 0
        for loc_x in _x:
            location = (loc_y, loc_x)
            current = n[loc_y][loc_x]
            left = n[loc_y][loc_x-1] if loc_x-1 >= 0 else ""
            right = n[loc_y][loc_x+1] if loc_x+1 < len(n[loc_y]) else ""
            up = n[loc_y-1][loc_x] if loc_y-1 >= 0 else ""
            down = n[loc_y+1][loc_x] if loc_y+1 < len(n) else ""
            if location in checked:
                continue
            if current != 0 :
                if left == 1:
                    c =+ 1
                    checked.add((loc_y,loc_x-1))
                if right == 1:
                    c =+ 1
                    checked.add((loc_y,loc_x+1))
                if up == 1:
                    c =+ 1
                    checked.add((loc_y-1,loc_x))
                if down == 1:
                    c =+ 1
                    checked.add((loc_y+1,loc_x))
                print(" " if left != "" else "", up)
                print(left, end = " ")
                print(current, end = " ") 
                print(right)
                print(" " if left != "" else "" , down)
            _c.append(c)


    return _c

def largestSizeT(matrix,c=0, x=0, y=0):
    current = n[loc_y][loc_x]
    left = n[loc_y][loc_x-1] if loc_x-1 >= 0 else ""
    right = n[loc_y][loc_x+1] if loc_x+1 < len(n[loc_y]) else ""
    up = n[loc_y-1][loc_x] if loc_y-1 >= 0 else ""
    down = n[loc_y+1][loc_x] if loc_y+1 < len(n) else ""
    if x == len(matrix[0]) and y == len(matrix):
        return c

def largestSize(matrix, x=0, y=0):
    if matrix[x][y] == 1:
        return 1 + largestSize(x+1,y)  + largestSize(x-1,y)  + largestSize(x,y+1)  + largestSize(x,y-1)  + largestSize(x+1,y+1)  + largestSize(x-1,y-1)
    if matrix[x][y] == 0:
        return 0

print(largestSize(ez_matrix))
