
def solution(numbers, target):
    
    count = 0
    
    def dfs(index, current_sum):
        nonlocal count
        
        if index == len(numbers):
            if current_sum == target:
                count += 1 
            return
        
        dfs(index + 1, current_sum + numbers[index])
        dfs(index + 1, current_sum - numbers[index])
    
    dfs(0,0)
                
    return count 