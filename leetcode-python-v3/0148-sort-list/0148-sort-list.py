# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        
        list_nums = []
        
        curr = head
        
        while curr:
            list_nums.append(curr.val)
            curr = curr.next
        
        list_nums = sorted(list_nums)
        
        dummy = ListNode(0)
        tail = dummy
        
        for n in list_nums:
            tail.next = ListNode(n)
            tail = tail.next
            
        return dummy.next
            
        
        
            
        


       
        