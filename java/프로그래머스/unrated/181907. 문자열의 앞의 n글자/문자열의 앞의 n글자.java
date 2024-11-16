class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            char c = my_string.charAt(i);
            sb.append(c);
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}