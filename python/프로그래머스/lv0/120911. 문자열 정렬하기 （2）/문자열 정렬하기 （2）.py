def solution(my_string):
    return ''.join(sorted([alp.lower() if alp.isupper() else alp for alp in my_string])) 