import java.io.*;
import java.util.*;

public class Solution {
    
    public static String test_score(int n, int x, int y){
        if(y%x == 0 || n*x == y){
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(test_score(n,x,y));
    }
}
