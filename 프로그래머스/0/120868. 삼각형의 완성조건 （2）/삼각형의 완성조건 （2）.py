def solution(sides):
    
    answer = 0
    
    l1 = min(sides[0], sides[1])
    l2 = max(sides[0], sides[1])
    
   
    

    for i in range(l2 - l1 +1, l2+1):
        
        answer += 1

   
    for i in range(l2+1, l1+l2):
       	answer += 1
    
    return answer