def solution(myString):
    answer = []


    split_str = myString.split('x')

    split_str = [substring for substring in split_str if substring != '']

    split_str.sort()

    return split_str