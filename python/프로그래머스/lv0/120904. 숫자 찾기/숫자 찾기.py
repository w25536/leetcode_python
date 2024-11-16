def solution(num, k):
    return [i for i, n in enumerate(str(num), start =1) if n == str(k)][0] if [i for i, n in enumerate(str(num), start =1) if n == str(k)] else -1