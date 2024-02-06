class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if not nums:
            return []
        
        ranges = []
        start = nums[0]
        end = nums[0]
        
        for n in nums[1:]:
            if n == end + 1:
                end = n
            else:
                if start == end:
                    ranges.append(str(start))
                else:
                    ranges.append(f"{start}->{end}")
                
                start, end = n, n
        if start == end:
            ranges.append(str(start))
        else:
            ranges.append(f"{start}->{end}")
        
        return ranges
         
    