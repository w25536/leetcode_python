def solution(rsp):
    return ''.join([str(0) if x == 2 else str(2) if x == 5 else str(5) if x == 0 else str(2) for x in map(int, rsp)])
    

    
