def solution(quiz):
    result = []
    
    for q in quiz :
        parts  = q.split('=')
        expression, answer = parts[0], int(parts[1])
        
        calculated_answer = eval(expression)
        
        if calculated_answer == answer:
            result.append('O')
        else:
            result.append('X')
        
    return result