def solution(numbers, direction):

    
    
    return numbers[len(numbers)-1:] + numbers[:len(numbers)-1] if direction == 'right'else numbers[1:] + [numbers[0]]
