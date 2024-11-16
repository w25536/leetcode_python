def solution(my_string):
    return ''.join(sorted(set(my_string), key = my_string.index))