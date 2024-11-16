def solution(binomial):
    answer = 0

    elements = binomial.split()
    
    a, op, b = int(elements[0]), elements[1], int(elements[2])
    
    if op == '+':
        answer = a + b 
    elif op == '-':
        answer = a - b
    elif op == '*':
        answer = a * b 
        
    return answer