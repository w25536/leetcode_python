def solution(n, slicer, num_list):
    answer = []
    
    a = slicer[0]
    b = slicer[1]
    c = slicer[2]
    
    if(n == 1):
        for i in range(0, b+1):
        	answer.append(num_list[i])
    if(n == 2):
    	for i in range(a, len(num_list)):
            answer.append(num_list[i])
    if(n == 3):
    	for i in range(a, b+1) :
            answer.append(num_list[i])
    if(n == 4):
    	for i in range(a, b+1, c):
            answer.append(num_list[i])
        
    return answer