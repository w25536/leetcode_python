def solution(s):
    
    return ''.join(sorted([char for char in s if s.count(char) == 1]))
        