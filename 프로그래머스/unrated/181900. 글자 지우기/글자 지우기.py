def solution(my_string, indices):
    char_list = list(my_string)
    for idx in sorted(indices, reverse=True):
        del char_list[idx]
    return ''.join(char_list)