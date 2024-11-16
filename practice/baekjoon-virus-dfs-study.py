def fn(graph, n):
    def dfs(node):
        stack = [node]
        seen.add(node)
        while stack:
            current = stack.pop()
            for neighbor in range(n):
                if graph[current][neighbor] == 1 and neighbor not in seen:
                    seen.add(neighbor)
                    stack.append(neighbor)
    
    seen = set()
    ans = 0

    for node in range(n):
        if node not in seen:
            # Start a new network
            dfs(node)
            ans += 1
    
    return ans





"""

def fn(graph):
    def dfs(node):
        ans = 0
        # do some logic
        for neighbor in graph[node]:
            if neighbor not in seen:
                seen.add(neighbor)
                ans += dfs(neighbor)
        
        return ans

    seen = {START_NODE}
    return dfs(START_NODE)

"""


n1 = 3
computers1 = [
    [1, 1, 0],
    [1, 1, 0],
    [0, 0, 1]
]
expected_output1 = 2



# Main function to solve the problem
def solution(n, computers):
    return fn(computers, n)


solution(n= n1, computers= computers1)

