

def solution(input_n):

    return int(input_n /3)


T = int(input())

for test_case in range(1, T +1):
    input_n = int(input())
    answer = solution(input_n)
    print("#{} {}".format(test_case, answer))