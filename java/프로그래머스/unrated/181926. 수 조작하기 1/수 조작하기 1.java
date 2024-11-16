import java.util.HashMap;

class Solution {
    public int solution(int n, String control) {
        HashMap<Character, Integer> directions = new HashMap<>();
        
        directions.put('w', 1);
        directions.put('s', -1);
        directions.put('d', 10);
        directions.put('a', -10);
        
        for(int i=0 ; i<control.length(); i++){
            char direction = control.charAt(i);
            if(!directions.containsKey(direction)){
                return -1;
            }
            n += directions.get(direction);
        }
        
        
		return n;

    }

}