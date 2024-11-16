def solution(n, computers):
    
    visited = [0 for _ in range(n)]
    answer = 0
    
    def dfs(pc):
        visited[pc] = 1
        for idx, c in enumerate(computers[pc]):
            if c and visited[idx]==0:
                dfs(idx)
                
    for pc in range(n):
        if visited[pc] == 0:
            dfs(pc)
            answer +=1
            
    return answer
