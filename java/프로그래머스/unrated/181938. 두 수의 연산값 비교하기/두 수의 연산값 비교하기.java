class Solution {
    public int solution(int a, int b) {
        
        String combined = String.valueOf(a) + String.valueOf(b);
        int combinedToInt = Integer.parseInt(combined);
        
        
        int answer = Math.max(combinedToInt, 2 * a * b);
        
        
        return answer;
    }
}