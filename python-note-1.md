

# __python__

![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)


---

vim

// space를 tab으로
:%s/    /\t/g
 
// tab을 space로
:%s/\t/    /g



Counter 
```python

import unittest
from collections import Counter

# The function to be tested
def solution(array):
    c = Counter(array)
    max_freq = c.most_common()[0][1]
    
    if list(c.values()).count(max_freq) == 1:
        return c.most_common()[0][0]
    else:
        return -1

# The test class
class TestSolution(unittest.TestCase):

    def test_1(self):
        self.assertEqual(solution([1, 2, 3, 3, 3, 4]), 3)

    def test_2(self):
        self.assertEqual(solution([1, 1, 2, 2]), -1)

    def test_3(self):
        self.assertEqual(solution([5, 5, 5, 5, 5, 9, 9, 9, 10]), 5)

    def test_4(self):
        self.assertEqual(solution([7, 8, 8, 9, 9, 9, 10, 10, 10]), -1)

    def test_5(self):
        self.assertEqual(solution([15]), 15)

# If you run the script, it'll execute the tests
if __name__ == '__main__':
    unittest.main()

```

most_common([n])
Return a list of the n most common elements and their counts from the most common to the least. If n is omitted or None, most_common() returns all elements in the counter. Elements with equal counts are ordered in the order first encountered:

>>>
Counter('abracadabra').most_common(3)
[('a', 5), ('b', 2), ('r', 2)]






문자열 

```python
import re

def solution(myString, pat):
    return len(re.findall(f'(?={pat})', myString))
```
```python

def solution(myString, pat):
    index = myString.rfind(pat)
    return myString[:index + len(pat)]
```
```python

from collections import defaultdict

def solution(strArr):
    length_count = defaultdict(int)
    
    for s in strArr:
        length_count[len(s)] += 1
        
    return max(length_count.values())
```
defaultdict를 사용해 문자열의 길이를 키로 하고 그 길이를 가진 문자열의 개수를 값으로 하는 사전을 생성합니다

```python
import re

def solution(myStr):

    splits = re.split('[abc]', myStr)
    answer = [s for s in splits if s]

    return answer if answer else ['EMPTY']
```
