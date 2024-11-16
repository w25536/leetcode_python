def solution(babbling):
    
    vs = ["aya", "ye", "woo", "ma"]
    answer = 0
    
    for word in babbling:
        temp_word = word
        for sound in vs:
            
            if temp_word.count(sound)  > 1 :
                break
            temp_word = temp_word.replace(sound," ")
        else:
            if not temp_word.strip():
                answer += 1
    
    
    
    return answer