def solution(arr):
    answer = []
    for num in arr:
        answer += [num] * num
    return answer