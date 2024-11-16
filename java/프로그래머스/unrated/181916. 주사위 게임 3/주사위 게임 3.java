import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        if (arr[0] == arr[3]) { // All elements are the same
            return 1111 * arr[0];
        } else if (arr[0] == arr[2]) { // Three elements are the same
            return (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3]);
        } else if (arr[1] == arr[3]) { // Three elements are the same
            return (10 * arr[1] + arr[0]) * (10 * arr[1] + arr[0]);
        } else if (arr[0] == arr[1] && arr[2] == arr[3]) { // Two pairs of identical numbers
            return (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[3]) { // One pair of identical numbers
            if (arr[0] == arr[1]){
                return arr[2] * arr[3];
            } else if (arr[1] == arr[2]){
                return arr[0] * arr[3];
            } else {
                return arr[0] * arr[1];
            }
        } else { // All elements are different
            return arr[0];
        }
    }
}