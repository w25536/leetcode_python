class Solution(object):
    def minOperations(self, nums):
        
        count = 0
        
        for i in range(len(nums)-1):
            if nums[i] >= nums[i+1]:
                increment = nums[i] - nums[i+1] +1
                nums[i+1] += increment
                count += increment
            
        return count
    
    
