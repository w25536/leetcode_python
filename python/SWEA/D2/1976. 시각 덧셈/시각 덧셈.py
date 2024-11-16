def solution(input_str):
    H1, M1, H2, M2 = map(int, input_str.split())  
    
    if M1 + M2 <= 60: 
        MM = M1 + M2 
        HH = H1 + H2
    else: 
        MM =  M1 + M2 - 60 
        HH = H1 + H2 + 1
    
    if HH <= 12:
        HH
    else:
        HH-=12
    
    
    return str(HH)+" "+str(MM)


T = int(input())

for test_case in range(1, T + 1): 
    TC = input()
    answer = solution(TC)
    print("#{} {}".format(test_case, answer))