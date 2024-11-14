import java.io.*;
import java.util.*;

public class Solution {
    
    public static String leap_or_not(int year){
        if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        System.out.println(leap_or_not(year));
    }
}
