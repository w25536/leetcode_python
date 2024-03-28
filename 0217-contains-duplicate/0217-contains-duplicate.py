class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        
        count = {}
        
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        
        for n, c in count.items():
            if c >=2:
                return True
        
        return False
            
                
            
            
        