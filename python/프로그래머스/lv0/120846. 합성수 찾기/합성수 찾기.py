def solution(n):
    return len([num for num in range(1,n+1) if len([i for i in range(1, n+1) if num % i == 0]) >= 3]) 