def solution(hp):
    return divmod(hp, 5)[0] + divmod(divmod(hp,5)[1],3)[0] + divmod(divmod(hp, 5)[1],3)[1]