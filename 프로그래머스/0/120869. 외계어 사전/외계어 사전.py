def solution(spell, dic):
    answer = 0
    
    word  = ''.join(sorted(spell))
   
    
    sorted_dic = [''.join(sorted(x)) for x in dic]
    
   
    
    if word in sorted_dic:
        return 1
    else:
        return 2
    
    
    return answer