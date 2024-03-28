class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dicts = defaultdict(list)
        
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) -ord('a')] += 1
        
            key = tuple(count)
            anagram_dicts[key].append(s)
                        
        return anagram_dicts.values()
            
            