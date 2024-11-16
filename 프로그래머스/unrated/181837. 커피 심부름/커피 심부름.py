def solution(order):
    answer = 0
    americano_price = 4500
    cafelatte_price = 5000

    menu = {
        "iceamericano": americano_price,
        "americanoice": americano_price,
        "hotamericano": americano_price,
        "americanohot": americano_price,
        "americano": americano_price,

        "icecafelatte": cafelatte_price,
        "cafelatteice": cafelatte_price,
        "hotcafelatte": cafelatte_price,
        "cafelattehot": cafelatte_price,
        "cafelatte": cafelatte_price,

        "anything": americano_price
    }
    
    for item in order: 
        answer += menu.get(item)
        
    return answer