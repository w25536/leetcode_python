def solution(s):
    elements = s.split()
    stack = []
    
    for elem in elements:
        if elem == 'Z' and stack:
            stack.pop()
        else:
            stack.append(int(elem))
    
    return sum(stack)
   
  