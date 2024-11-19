import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long div_3 = n/3;
        long div_5 = n/5;
        long div_5n3 = n / 15;
        
        System.out.println(div_3 + div_5 - div_5n3);
    }
}
