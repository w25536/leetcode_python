class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
       	if(arr1.length != arr2.length){
            return arr1.length > arr2.length ? 1 : -1;
        }else{
            int res1 = 0;
            int res2 = 0;
            
            for(int i=0; i<arr1.length; i++){
               res1 += arr1[i];
               res2 += arr2[i];
            }
            
            if(res1 == res2){
                return 0;
            }
            
            
            return res1 > res2 ? 1 : -1;
        }
        
  
        
       
    }
}