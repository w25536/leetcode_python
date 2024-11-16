from collections import Counter

def solution(array):
    
    
    c = Counter(array); max_freq = c.most_common()[0][1]
    
    
    #print(c.most_common()[])
    
    if list(c.values()).count(max_freq) == 1:
        return c.most_common()[0][0]
    else:
        return -1
    
    
    