class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        
        cnt = collections.defaultdict(int)

        
        for num in nums:
            cnt[num] += 1
            
        
        for k, v in cnt.items():
            if v >= 2:
                return k
        
            
            
            
        
        
            
            
            

       
            
            
            
            
         
        