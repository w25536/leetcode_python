class MinStack:

    #lets do it
    def __init__(self): # claim two stacks
        
        self.stack = []
        self.minStack = []
        

    def push(self, val: int) -> None:
        self.stack.append(val) #Append the value at stack
        val = min(val, self.minStack[-1] if self.minStack else val)
        self.minStack.append(val)
        

    def pop(self) -> None:
        self.stack.pop()
        self.minStack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.minStack[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()