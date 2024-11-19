import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int k = sc.nextInt();
        
        if((N & (1L << (k-1))) != 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
