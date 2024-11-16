def solution(numbers):
    num_map = {
        "zero": "0", "one": "1", "two": "2", "three": "3", "four": "4",
        "five": "5", "six": "6", "seven": "7", "eight": "8", "nine": "9"
    }
    
    answer = ""
    word = ""
    
    for char in numbers:
        word += char
        if word in num_map:
            answer += num_map[word]
            word = ""



    return int(answer)