class Solution:
    def maxArea(self, height: List[int]) -> int:

        # this approach is brute forace 
        #         ans = 0

        #         for l in range(len(height)):
        #             for r in range(l+1, len(height)):  
        #                 area = (r -l) * min(height[l], height[r])
        #                 ans = max(area, ans)
        #         return ans

        # also can be solved using two pointers 

        l = 0
        r = len(height)-1

        ans = 0

        while l < r:
            area = (r-l) * min(height[l], height[r])
            ans =  max(area, ans)

            if height[l] < height[r]:
                l+=1
            else:
                r-=1
        return ans  