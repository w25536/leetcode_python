def solution(bin1, bin2):
    answer = ''
    
    num1 = int(bin1, 2)
    num2 = int(bin2, 2)
    
    sum = num1 + num2 
    
    result = bin(sum)[2:]
    
    
    return result