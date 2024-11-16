def solution(myString, pat):
    trans = str.maketrans("AB", "BA")
    myString = myString.translate(trans)
    if pat in myString:
        return 1
    else:
        return 0