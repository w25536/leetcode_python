class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        l = 0
        r = len(numbers) -1
        
        #sum = nums[l] + nums[r]
        
        while l < r:
            sum = numbers[l] + numbers[r]
            
            if target == sum:
                l+=1
                r+=1
                return [l, r]

            if target < sum:
                r -= 1
            elif target > sum:
                l += 1
           
            
        return 0 