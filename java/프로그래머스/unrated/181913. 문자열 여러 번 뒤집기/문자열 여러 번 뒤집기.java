class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            String stringToReverse = sb.substring(start, end + 1);
            sb.replace(start, end + 1, new StringBuilder(stringToReverse).reverse().toString());
        }
        return sb.toString();
    }
}