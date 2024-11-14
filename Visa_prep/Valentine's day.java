import java.io.*;
import java.util.*;

public class Solution {
    
    public static int max_chocolates(int x, int y){
        return (int) x/y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(max_chocolates(x,y));
    }
}
