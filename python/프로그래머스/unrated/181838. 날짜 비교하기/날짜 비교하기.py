def solution(date1, date2):
    answer = 0
    
    x1, y1, z1= date1[0], date1[1], date1[2]
    x2, y2, z2 = date2[0], date2[1], date2[2]
    
    
    if x1 < x2:
        return 1
    elif x1 == x2 and y1 < y2 :
        return 1
    elif x1 == x2 and y1 == y2 and z1 < z2:
        return 1
    else:
        return 0
        
    