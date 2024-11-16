def solution(my_string):
    return ''.join([alp.lower() if alp.isupper() else alp.upper() if alp.islower() else alp for alp in my_string])