import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        
        if(z < x){
            System.out.println("0");
        } else if (z >= x+y){
            System.out.println("2");
        } else {
            System.out.println("1");
        }
    }
}
