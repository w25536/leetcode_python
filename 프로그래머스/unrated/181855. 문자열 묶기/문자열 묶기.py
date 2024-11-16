from collections import defaultdict

def solution(strArr):
    
    answer = defaultdict(int)
    
    for s in strArr:
        answer[len(s)] += 1
        
        
    return max(answer.values())