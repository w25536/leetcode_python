
def calculate_minimum_sum(string):
    split_sums = []
    n = len(string)

    for i in range(1, n):
        num1 = int(string[:i])
        num2 = int(string[i:])
        split_sums.append(num1 + num2)

    return min(split_sums)


T = int(input())

for test_case in range(1, T + 1):
    TC = input()
    answer = calculate_minimum_sum(TC)
    print("#{} {}".format(test_case, answer))
    