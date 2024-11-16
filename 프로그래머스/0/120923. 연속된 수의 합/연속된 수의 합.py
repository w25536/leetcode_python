def solution(num, total):
    answer = []
    
    average = total / num
    
    if num % 2 == 0 : 
        start = int(average - (num / 2) + 0.5)
    else:
        start = int(average - (num // 2))
        
    
    answer = [start + i for i in range(num)]
    
    print(answer)
    
    return answer