class Solution:
    def climbStairs(self, n: int) -> int:
        
        cache = {}
        
        
        def memonization(n):

            if n <= 1: 
                return 1
            if n in cache:
                return cache[n]
            cache[n] = memonization(n - 1) + memonization(n - 2)
            return cache[n]


        return memonization(n)






