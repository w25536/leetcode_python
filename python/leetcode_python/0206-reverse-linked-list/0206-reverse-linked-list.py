# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        #5 -> 4 -> 3 -> 2 -> 1
        # prev -> null
        # curr -> head 
        # t = curr.next
        # c.next = prev
        # p = curr 
        # c = t 
        
        
        prev, curr = None, head
        
        while curr:
            nxt = curr.next 
            curr.next = prev
            prev = curr
            curr = nxt 
            
        return prev
            
            
              
        
    