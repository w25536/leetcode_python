def solution(dots):
    xs = [dot[0] for dot in dots]
    ys = [dot[1] for dot in dots]

    if (ys[0] - ys[1]) / (xs[0] - xs[1]) == (ys[2] - ys[3]) / (xs[2] - xs[3]):
        return 1
    
    if (ys[0] - ys[2]) / (xs[0] - xs[2]) == (ys[1] - ys[3]) / (xs[1] - xs[3]):
        return 1

    if (ys[0] - ys[3]) / (xs[0] - xs[3]) == (ys[1] - ys[2]) / (xs[1] - xs[2]):
        return 1
    
    return 0