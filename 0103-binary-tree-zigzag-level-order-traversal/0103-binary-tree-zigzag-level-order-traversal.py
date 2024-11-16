# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        
       
        #put every level of binary tree to list e.g. [[3], [20, 9], [15, 7]]
        
        #how? in revese order dir? left to right sequence ? [20, 9] -> [9,20]
        
        #overall time is O(n) using queue data structure 
        
        
        #bfs way
        
        res = []
        q = deque([root] if root else[]) #in python using deque
        
        while q:
            level = []
            for i in range(len(q)):
                node = q.popleft()
                level.append(node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            level = reversed(level) if len(res) % 2 else level #if is even reversed
            res.append(level) 
            
        return res
                
        
        
        
        