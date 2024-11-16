import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArr = a.toCharArray();
        
        for(int i=0; i<charArr.length; i++){
            System.out.println(charArr[i]);
        }
    }
}