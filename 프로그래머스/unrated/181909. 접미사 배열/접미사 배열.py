def solution(my_string):
    answer = []

    for i in range(len(my_string)):

        suffix = my_string[i:]
        answer.append(suffix)          

        answer.sort()

    return answer	