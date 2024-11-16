def solution(intStrs, k, s, l):
    answer =[]
    for string in intStrs:
        num = int(string[s:s+l])
        if num > k: 
        	answer.append(num)
    return answer       
    