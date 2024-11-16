def solution(chicken):

    total_service_chicken = 0

    coupons = chicken

    while coupons >= 10 :
        service_chicken = coupons // 10
        total_service_chicken += service_chicken

        coupons = service_chicken + (coupons % 10)

    return total_service_chicken
    