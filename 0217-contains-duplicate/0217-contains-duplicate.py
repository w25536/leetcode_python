class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
       
        num_dicts = collections.defaultdict(int)
        
        for n in nums:
            if num_dicts[n] > 0 :
                return True
            num_dicts[n] += 1
            
        return False
            
        
        
        