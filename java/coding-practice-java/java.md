


## Setup

> - First, set up the IdeaVim environment.
> - Text Style Multiple Selections: Alt + Shift + Mouse Click
> - Array to string : Arrays.toString();
> - Direct Internet Search : Shift + Command + l

## HashMap 
> - The getOrDefault method returns the value mapped to the specified key in a HashMap. If that key is not present then a default value is returned.”

==============================================================================

```
    public static <T> void print(T type) {

        if (type instanceof ArrayList) {
            System.out.println(Arrays.asList(type));
        } else if (type instanceof int[]) {
            System.out.println(Arrays.toString((int[]) type));
        } else if (type instanceof char[]) {
            System.out.println(Arrays.toString((char[]) type));
        } else if (type instanceof int[][]) {
            System.out.println(Arrays.deepToString((int[][]) type));
        } else {
            System.out.println(type);
        }
    }
    
```    
    

        Map<Integer, Integer> count = new HashMap();

        for (int x: A) {
            count.put(x, count.getOrDefault(x, 0) + 1);
            /** 찾는 키가 존재 한다면 찾는 키의 값을 반환 하고 없다면 기본 값을 반환 한다. */

        }

        for (int k: count.keySet()) {
            if(count.get(k) > 1){
                return k;
            }
        }
```
        Map<Character, Integer> chars = new HashMap();

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r,0) + 1); //hashmap +1 if the same element found
            
            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1); // hashmap -1 if the same element found
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        
        return res;
   

```

Pascal's Triangle 

why is thsi Dynmaic Programming? 
1. There is optimal substructure.
2. There are overlapping subproblems. 

Dynamic Programming Framework 
1. Base Case -> The value at the beginning or end of a row is always 1. 
2. Recurrence Relation -> each number is the sum of the two numbers directly above it.



<img width="772" alt="2023-01-05_18-26-16" src="https://user-images.githubusercontent.com/43588796/210746450-516bfe59-97fd-4a9d-8b9f-d00b5d763df9.png">




```
