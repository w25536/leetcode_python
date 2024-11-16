import java.util.*;

class Solution {
    public int solution(int a, int b) {
        if (a % 2 == 1 && b % 2 == 1) {
            return (int)(Math.pow(a, 2)) + (int)(Math.pow(b, 2));
        } else if (a % 2 == 1 || b % 2 == 1) {
            return 2 * (a + b);
        } else if (a % 2 != 1 && b % 2 != 1) {
            return Math.abs(a - b);
        }
        return 0; // Add a default return value for the case where none of the conditions are met.
    }
}