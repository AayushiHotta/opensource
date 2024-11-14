import java.io.*;
import java.util.*;

public class Solution {
    
    public static String assignment_complete(int x, int y, int z){
        int minutes_in_a_day = 24*60;
        if(x*y <= minutes_in_a_day*z){
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        System.out.println(assignment_complete(x,y,z));
    }
}
