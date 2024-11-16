class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        int start = my_string.length() - n;	
        int end = my_string.length();
        System.out.println(my_string.length());
        
        
        for(int i= start; i < end ;i++){
            char c = my_string.charAt(i);
            answer.append(c);
        }
        return answer.toString();
    }
}