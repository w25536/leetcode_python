class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        #lets do it! 

        ans = [1] * len(nums) #[1, 1, 1, 1]
        
        prefix = 1
        for i in range(len(nums)):
            ans[i] = prefix
            prefix *= nums[i] #[1,2,3,4] 
        
        #ans = [1, 1, 2, 6]
        
 
        postfix = 1
        for i in range(len(nums)-1, -1, -1): #3, 2, 1, 0
            ans[i] *= postfix
            postfix *= nums[i] #[1,2,3,4] 
        
        # i=3
        # ans[3] = 6
        # postfix = 1
        # ans[3] * 1 = 6 
        # ans = [1, 1, 2, 6]
        # nums[3] = 4
        # postfix will be updated to 4 
        
        # i=2
        # ans[2] = 2
        # postfix = 4 
        # ans = [1, 1, 8, 6]
        # nums[2] = 3
        # postfix will be updated to 12
        
        # i=1
        # ans[1] = 1
        # postfix = 12
        # postfix = [1, 12, 8, 6]
        # nums[1] = 2
        # postfix will be updated to 24
        
        # and so on....
        # [24,12,8,6]
        
        return ans