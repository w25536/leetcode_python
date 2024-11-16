class Solution:
    def isValid(self, s: str) -> bool:

        stack = []


        bracket_map = {')':'(', '}':'{', ']':'['}

        for char in s:
            if char in bracket_map:
                if not stack or stack[-1] != bracket_map[char]:
                    return False
                else:
                    stack.pop()
            else: 
                stack.append(char)

        return not stack








