import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        int i=0;

        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = Integer.MAX_VALUE;
            for(int j = s ; j <= e; j++){
                if(k < arr[j] && arr[j] < min){
                    min = arr[j];
                }         
            }

            if(min == Integer.MAX_VALUE){
                min = -1; 
            }

            answer[i++] = min;



        }
        return answer;
    }
}