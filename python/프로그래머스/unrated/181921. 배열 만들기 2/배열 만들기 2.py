def solution(l, r):
    answer = []
    
    for i in range(l, r+1):
        if all(c in '50' for c in str(i)):
            answer.append(i)
    
    if not answer:
        return [-1]
    
    print(answer)
    
    return answer