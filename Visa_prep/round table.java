import java.io.*;
import java.util.*;

public class Solution {
    public static int factorial(int n){
        int fact = 1;
        for(int i= n;i>0;i-- ){
            fact = fact * i;
        }
        return fact;
    }
    
    public static int sitting_way(int n){
        return (factorial(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //number of seats available
        
        System.out.println(sitting_way(n));
    }
}
