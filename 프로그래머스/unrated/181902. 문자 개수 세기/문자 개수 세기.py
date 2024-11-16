def solution(my_string):
    count = [0]*52  # 각 알파벳 별로 카운트를 저장할 52개의 0이 들어있는 리스트를 생성합니다.
    
    for char in my_string:  # 문자열의 각 문자에 대해 반복합니다.
        ascii_val = ord(char)  # 문자의 ASCII 코드 값을 가져옵니다.
        if 65 <= ascii_val <= 90:  # 대문자인 경우
            count[ascii_val - 65] += 1  # 대문자 'A'의 ASCII 코드 값은 65이므로, 이를 빼서 적절한 인덱스를 계산합니다.
        elif 97 <= ascii_val <= 122:  # 소문자인 경우
            count[ascii_val - 71] += 1  # 소문자 'a'의 ASCII 코드 값은 97이지만, 대문자 부분이 26개 있으므로, 적절한 인덱스를 계산하기 위해 71을 뺍니다.
    
    return count