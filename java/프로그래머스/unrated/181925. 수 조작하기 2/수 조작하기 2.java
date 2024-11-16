import java.util.HashMap;

class Solution {
    public String solution(int[] numLog) {
       	HashMap<Integer,Character> directions = new HashMap<>();
        directions.put(1, 'w');
        directions.put(-1, 's');
        directions.put(10, 'd');
        directions.put(-10, 'a');
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<numLog.length; i++){
            int diff = numLog[i] - numLog[i - 1];
            if(directions.containsKey(diff)){
                sb.append(directions.get(diff));
            }
            
        }
        
        return sb.toString();
    }
}