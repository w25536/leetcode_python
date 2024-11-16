def solution(myString):
    answer = []
    
    split_str = myString.split('x')
    
    for substring in split_str:
        length = len(substring)
        answer.append(length)
    	
    
    return answer