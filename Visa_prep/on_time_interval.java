import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
      //No. of test cases
        int n = sc.nextInt();
        int[] arr = new int[n];

      //input 
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

      
        for(int i = 0;i<n;i++){
          //if he starts before 30 or more minutes, he will be able to reach
            if(arr[i] >= 30){
                System.out.println("YES");
            //Otherwise he will not be able to reach on time
            } else {
                System.out.println("NO");
            }
        }
    }
}
