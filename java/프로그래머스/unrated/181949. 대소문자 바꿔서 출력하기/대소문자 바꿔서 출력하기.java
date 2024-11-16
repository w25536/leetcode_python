import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] charArr = a.toCharArray();

        for(int i=0 ; i<charArr.length; i++){
            if (Character.isLowerCase(charArr[i])){
                charArr[i] = Character.toUpperCase(charArr[i]);
            }else{
                charArr[i] = Character.toLowerCase(charArr[i]); 
            }
        }
       System.out.println(String.valueOf(charArr));
    }
}