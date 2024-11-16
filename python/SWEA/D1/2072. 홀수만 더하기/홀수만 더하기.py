def calculate_odd_sum(string):
    split_num = string.split()
    n = len(split_num)
    total_sum = 0; 
    
    for i in range(n):
        if int(split_num[i]) % 2  != 0:
            total_sum+=int(split_num[i])
    return total_sum 
        
        
T = int(input())

for test_case in range(1, T + 1):
    TC = input()
    answer = calculate_odd_sum(TC)
    print("#{} {}".format(test_case, answer))
    