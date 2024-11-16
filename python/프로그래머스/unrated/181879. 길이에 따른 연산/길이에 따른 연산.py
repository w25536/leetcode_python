def solution(num_list):
    if len(num_list) <= 10 :
        result = 1
        for num in num_list:
            result *= num
        return result
    else:
        result = 0
        for num in num_list:
            result += num
        return result
                
    