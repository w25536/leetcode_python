def solution(myString, pat):
    
    index = myString.rfind(pat)
           
    return myString[:index+len(pat)]