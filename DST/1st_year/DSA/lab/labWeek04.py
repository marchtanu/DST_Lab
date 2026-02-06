binary_matrix1 = [
    [1, 1, 1, 0, 1],
    [1, 1, 1, 0, 1],
    [0, 0, 1, 0, 1],
    [1, 0, 0, 0, 1],
    [1, 0, 1, 1, 1]
]
ez_matrix = [
    [1, 0, 0],
    [0, 1, 0],
    [0, 0, 1]
]
def largestSize(matrix):
    rows, cols = len(matrix), len(matrix[0])
    visited = set()
    def dfs(r, c):
        if (r < 0 or r == rows or c < 0 or c == cols or matrix[r][c] == 0 or (r, c) in visited):
            return 0
        visited.add((r, c))
        return (1 + dfs(r+1, c)
                + dfs(r, c+1)
                + dfs(r, c-1)
                + dfs(r-1, c)
                + dfs(r-1, c-1)
                + dfs(r+1, c+1)
                + dfs(r-1, c+1)
                + dfs(r+1, c-1))
    area = 0
    for r in range(rows):
        for c in range(cols):
            area = max(area, dfs(r, c))
    return area
print(largestSize(ez_matrix))
print(largestSize(binary_matrix1))