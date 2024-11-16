class Solution {
    public int solution(String number) {
        int sum = 0;
        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            sum += c - '0';
        }
       
        return sum % 9;
    }
}