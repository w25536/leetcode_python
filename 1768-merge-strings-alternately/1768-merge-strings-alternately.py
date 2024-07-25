class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        merged_string  = []
        i = 0
        
        while i < len(word1) and i < len(word2) :
            merged_string.append(word1[i])
            merged_string.append(word2[i])
            i += 1

        if i < len(word1):
            merged_string.extend(word1[i:])
        elif i < len(word2):
            merged_string.extend(word2[i:])
        
        return ''.join(merged_string)
        
        


