import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int point_for_each_problem = x/10;
            System.out.println(point_for_each_problem * y);
        }
    }
}
