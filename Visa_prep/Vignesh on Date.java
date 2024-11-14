import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        
        if(x >= y){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
