import java.io.*;
import java.util.*;

public class Solution {
    
    public static int number_of_books(int n){
        return (n * 1000)/100;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(number_of_books(n));
    }
}
