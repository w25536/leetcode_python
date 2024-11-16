def solution(n):
    if n == 1:
        return [[1]]

    answer =[[0 for j in range(n)] for i in range(n)]

    x = 0
    y = 0
    dir = 'r'

    for i in range(n*n):
        answer[x][y] = i + 1
        if dir == 'r':
            if y== n-1 or answer[x][y+1] != 0:
                dir ='d'
                x += 1
            else:
                y += 1
        elif dir == 'd':
            if x == n-1 or answer[x+1][y] != 0:
                dir = 'l'
                y -= 1
            else:
                x += 1
        elif dir == 'l':
            if y == 0 or answer[x][y-1] != 0:
                dir = 'u'
                x -= 1
            else:
                y -= 1
        elif dir == 'u':
            if x == 0 or answer[x-1][y] != 0:
                dir = 'r'
                y += 1
            else:
                x -= 1

    return answer


