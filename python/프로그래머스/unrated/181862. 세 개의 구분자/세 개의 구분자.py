import re

def solution(myStr):
    
    
    splits = re.split('[abc]', myStr)
    
    answer = [s for s in splits if s]
   
    
    return answer if answer else ['EMPTY']