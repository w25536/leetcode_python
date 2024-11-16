def solution(n):
    return next(m for m in range(1, 100) if 6 * m % n == 0)
