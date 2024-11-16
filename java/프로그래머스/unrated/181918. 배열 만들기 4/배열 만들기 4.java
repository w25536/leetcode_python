import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int num : arr){
            while(!stk.isEmpty() && stk.peek() >= num){
                stk.pop();
            }
            stk.push(num);
        }
        
        int[] answer = new int[stk.size()];
        
        for(int i=0; i<answer.length;i++){
            answer[i] = stk.get(i);
        }
        
        
        return answer;
    }
}