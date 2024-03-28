class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        s1 = [0] * 26
        t2 = [0] * 26
        
        if len(s) != len(t):
            return False
        
        for c in s:
            s1[ord(c) - ord('a')] += 1
        
        for c in t:
            t2[ord(c) - ord('a')] += 1
        
        if(s1 != t2):
            return False
        
        return True
            