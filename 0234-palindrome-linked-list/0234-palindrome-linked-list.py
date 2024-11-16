# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        
        nums = []
        
        curr = head 
        
        while curr:
            nums.append(curr.val)
            curr = curr.next
            
        s =''.join(str(num) for num in nums)
        
        
        newStr =""
        
        
        for c in s:
            if c.isalnum():
                newStr += c.lower()
        return newStr == newStr[::-1]
            
        
        
        
            
