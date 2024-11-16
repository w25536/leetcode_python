def solution(arr):
    stk = []
    
    for num in arr: 
        if not stk:
            stk.append(num)
        elif stk[-1] == num:
            stk.pop()
        else:
            stk.append(num)
    
    return stk if stk else [-1]


#Push - Add an element to the top of the stack.
#Pop - Remove and return the top element from the stack.
#Peek/Top - View the top element without removing it.
#isEmpty - Check if the stack is empty.

#Push is equivalent to the list's append() method.
#Pop is the list's pop() method.
#Peek/Top can be achieved by accessing the last element, i.e., stk[-1].
#isEmpty is as simple as checking if not stk:.