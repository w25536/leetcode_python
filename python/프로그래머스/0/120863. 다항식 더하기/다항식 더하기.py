def solution(polynomial):
    terms = polynomial.split(' + ')  # 항 분리
    x_sum = 0  # 일차 항의 합
    const_sum = 0  # 상수항의 합
    
    for term in terms:
        if 'x' in term:  # 일차 항인 경우
            if term == 'x':  # 계수가 생략된 경우(계수가 1)
                x_sum += 1
            else:  # 계수가 명시된 경우
                x_sum += int(term[:-1])  # 'x'를 제외한 부분을 정수로 변환하여 더함
        else:  # 상수항인 경우
            const_sum += int(term)
    
    # 결과 문자열 생성
    result = ""
    if x_sum > 0:
        if x_sum == 1:
            result += "x"
        else:
            result += str(x_sum) + "x"
    if const_sum > 0:
        if result:  # 일차 항이 있으면 상수항 앞에 " + "를 추가
            result += " + "
        result += str(const_sum)
    
    return result