import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        
        
        for(int i=0; i<n; i++){
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}