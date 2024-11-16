def solution(myString):
    answer = ''
    
    for char in myString :
        if char == 'a':
            answer+= 'A'
        elif char.upper() and char != 'A':
            answer += char.lower()
        else:
            answer += char
    
    
    
    return answer