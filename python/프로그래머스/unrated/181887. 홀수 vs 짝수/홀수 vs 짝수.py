def solution(num_list):
    even_sum, odd_sum = 0, 0
   
    for i in range(len(num_list)):
        if i % 2 == 0 :
            even_sum += num_list[i]
        else: 
            odd_sum += num_list[i]
    
 
    
    return max(even_sum, odd_sum) 