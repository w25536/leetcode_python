class Solution:
    def rob(self, nums: List[int]) -> int:
        
        #lets do it bro
        
        #needs two variable rob1 and rob2 initialized with 0 space complexity of O(1)
        
        rob1, rob2 = 0, 0
        
        
        for n in nums: 
            temp =  max(rob1 + n, rob2) #stores the max value 
            rob1 = rob2 #updates the rob1 with rob2
            rob2 = temp #then updates rob2 with the temp
            
        return rob2
    
    
            
            
        
        