def solution(myString, pat):
    pattern = pat.lower()
    
    return int(pattern in myString.lower())
        