def solution(arr):
    answer = [[]]
    
    rows = len(arr)
    cols = len(arr[0])
    
    if rows > cols: 
    	for i in range(rows):
            arr[i] += [0] * (rows - cols)
    elif cols > rows:
        for _ in range(cols - rows):
        	arr.append([0] * cols)
        
    answer = arr    
        
    return answer