class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 1){
                oddSb.append(String.valueOf(num_list[i]));
            }else{
                evenSb.append(String.valueOf(num_list[i]));
            }
        }
        
   
        System.out.println(oddSb.toString());
        System.out.println(evenSb.toString());

        
    
        return Integer.parseInt(oddSb.toString())+Integer.parseInt(evenSb.toString());
    }
}