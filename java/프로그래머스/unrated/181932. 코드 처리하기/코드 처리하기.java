class Solution {
    public String solution(String code) {  

        int mode = 0;  // 0: false 1: true 
        StringBuilder sb = new StringBuilder();

        for(int idx = 0; idx < code.length(); idx++){
            char c = code.charAt(idx);

            if(c == '1'){
                mode = 1 - mode;        
            } else {
                if((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 == 1)){
                    sb.append(c);
                }
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}