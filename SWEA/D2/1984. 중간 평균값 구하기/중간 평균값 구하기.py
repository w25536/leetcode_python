def solution(input_str):
    
    nums = list(map(int, input_str.split()))

    max_value = max(nums)
    min_value = min(nums)
    
    nums.remove(max_value)
    nums.remove(min_value)
        
    return round(sum(nums)/ len(nums)) 

T = int(input())

for test_case in range(1, T + 1):
    TC = input()
    answer = solution(TC)
    print("#{} {}".format(test_case, answer))