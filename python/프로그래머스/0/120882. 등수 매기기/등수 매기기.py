def solution(score):
    
    a = sorted([sum(i) for i in score], reverse = True)
    
    print(a)
    
    return [a.index(sum(i)) + 1 for i in score]