def dfs(x, y, visited, n):
    directions = [(-1, 1),(0, 1),(1, 1),(-1, 0),(1, 0),(-1, -1),(0, -1),(1, -1)]
    for dx, dy in directions:
        print(dx)
        nx, ny = x +dx, y + dy
        if 0 <= nx < n and 0 <= ny < n :
            visited[nx][ny] = True


def solution(board):
    n = len(board)
    visited = [[False] * n for _ in range(n)]
    
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                visited[i][j] = True
                dfs(i, j, visited, n)
                
    safe_areas = sum(1 for i in range(n) for j in range(n) if not visited[i][j])          
    
    return safe_areas

  