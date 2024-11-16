import re

def solution(myString, pat):

    return len(re.findall(f'(?={pat})', myString))