def solution(numlist, n):

    def sort_key(x):

        return abs(x - n), -x
    
    answer = sorted(numlist, key=sort_key)

    return answer