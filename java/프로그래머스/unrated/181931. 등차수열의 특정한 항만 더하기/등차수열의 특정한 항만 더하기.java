import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] arithmeticArr = new int[included.length];
        
        arithmeticArr[0] = a;
        for(int i=1 ; i<arithmeticArr.length; i++){
            
            arithmeticArr[i] = arithmeticArr[i-1] +d;           
            
        }
                 
        for(int i=0; i<included.length; i++){
            if(included[i] ==true){
               answer += arithmeticArr[i];
            }
        }
        
        
        return answer;
    }
}