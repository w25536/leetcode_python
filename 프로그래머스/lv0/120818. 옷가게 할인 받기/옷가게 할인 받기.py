def solution(price):
    return int(price * 0.8) if price >= 500000 else int(price * 0.9) if price >= 300000 else int(price * 0.95) if price >= 100000 else price