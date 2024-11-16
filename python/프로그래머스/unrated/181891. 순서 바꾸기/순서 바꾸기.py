def solution(num_list, n):
    answer = []


    answer +=num_list[n:len(num_list)] + num_list[:n]

    return answer
