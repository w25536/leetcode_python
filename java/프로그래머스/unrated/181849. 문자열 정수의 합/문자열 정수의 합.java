class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        char[] num_charArr = num_str.toCharArray();
        
        for(int i=0; i<num_charArr.length; i++){
            
            answer+= num_charArr[i] - '0';
        }
        // you need to convert each character to its corresponding integer value. You can achieve this by subtracting the Unicode code point of the character '0' from the Unicode code point of the character you want to convert.
        return answer;
    }
}