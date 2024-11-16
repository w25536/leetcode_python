def solution(arr):
    answer = []
    
    length = len(arr)
    
    
    target_length = 1
    
    while target_length < length:
        target_length*=2
    
    for _ in range(target_length - length):
        arr.append(0)
    
    answer = arr
    
    return answer