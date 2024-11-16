

def solution(n):
    prime_factors = []
    divisor = 2
    while n >= 2:
        if n % divisor == 0:
            if divisor not in prime_factors:
                prime_factors.append(divisor)
            n //= divisor
        else:
            divisor += 1
    
    return prime_factors
        
