class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        #create count
        count = {}
        #create # of []
        freq = [[] for i in range(len(nums)+1)]
        
        
        #lets do count!
        for n in nums:
            count[n] = 1 + count.get(n, 0) # count get n else 0
        #so count is done {1: 3, 2: 2, 3: 1} n: number, c: count
        for n, c in count.items(): #here, n is num and c is count
            freq[c].append(n) 
            # on the freq array at index of c appends n
            # **you are not getting n of index which can cause index out of boudary
            # if you have 100, then you won't get 100 since the size of array is only 6. 
            # Once you apply this code, then it will look like this 
            # [[], [3], [2], [1], [], [], []]
        
        #Finally, for looping from the backward since you are getting the most frequent elemetns -The higher the index means the most frequent elements is.
        ans = [] #so create ans list, which to store the ans
        for i in range(len(freq)-1, 0, -1):
            for n in freq[i]: #you are getting array of array so double looping
                ans.append(n)
                if len(ans) == k: #you need to stop adding elem until k and return ans
                    return ans
            
          
    
            
        
        
        
        
        
  
                    
    
        
        
       