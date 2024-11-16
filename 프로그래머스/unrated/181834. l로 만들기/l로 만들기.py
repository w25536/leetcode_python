def solution(myString):
    answer = ''

    for alp in myString : 
        if alp < 'l':
            answer += 'l'
        else: 
            answer += alp

    return answer 