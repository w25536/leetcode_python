def solution(my_string, m, c):
    answer = ""
    for i in range(c-1, len(my_string), m):
        print(i)
        answer += my_string[i]
    return answer