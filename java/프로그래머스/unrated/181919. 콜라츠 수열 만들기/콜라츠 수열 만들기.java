import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> l = new ArrayList<>();
        while(n > 1){
            l.add(n);
            if(n % 2==0){
                n = n/2;
            }else{
                n = 3 * n + 1;
            }            
        }
        l.add(n);
        
        int[] answer = new int[l.size()];
        for(int i = 0; i < l.size(); i++){
            answer[i] = l.get(i);
        }




        return answer;
    }
}