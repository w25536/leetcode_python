class Solution {
    public int solution(int[] num_list) {
        int index = -1;
        int i = 0; 
        for(int num : num_list){
            if(num < 0){
                index = i; 
                break;
            }
            i++;
        }
        return index;
    }
}