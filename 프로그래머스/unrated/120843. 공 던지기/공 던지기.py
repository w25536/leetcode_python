def solution(numbers, k):
    current_position = 0  
    for _ in range(k - 1):  
        current_position = (current_position + 2) % len(numbers)
    return numbers[current_position]
