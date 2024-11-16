import java.io.*;
import java.util.*;

public class Solution {
    
    public static long reverse(long n){
        
        long result = 0;
        while(n != 0){
            long last_digit = n%10;
            result = result * 10 + last_digit;
            n /= 10;
            if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            result = 0;
        }
        }
        
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        System.out.println(reverse(n));
    }
}
