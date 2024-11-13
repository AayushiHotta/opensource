import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // For each test case, process N and M values
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // Number of students
            int M = sc.nextInt(); // Number of tickets available
            
            // Calculate students who won't get tickets
            int result = Math.max(0, N - M);
            
            // Print the result for this test case
            System.out.println(result);
        }
        
        sc.close();
        
    }
}
