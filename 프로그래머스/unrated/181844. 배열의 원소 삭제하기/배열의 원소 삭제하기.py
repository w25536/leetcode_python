def solution(arr, delete_list):
    answer = []
    
    for elem in arr: 
        if elem not in delete_list:
            answer.append(elem)
    
    return answer