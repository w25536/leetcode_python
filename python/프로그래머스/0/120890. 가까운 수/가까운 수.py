def solution(array, n):
    
    diff_list = [(abs(x - n), x) for x in array]
    
    diff_list.sort(key=lambda x: (x[0], x[1]))
    
    return diff_list[0][1]
    
    