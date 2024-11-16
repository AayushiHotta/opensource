import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] result = new int[n];
        
        
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            int row_sum = 0;
            int col_sum = 0;
            
            for(int j = 0;j<n;j++){
                row_sum += arr[i][j];
            }
            for(int j = 0;j<n;j++){
                col_sum += arr[j][i];
            }
            result[i] = row_sum + col_sum;
        }
        for(int i = 0;i<n;i++){
            System.out.print(result[i]+ " ");
        }
    }
}
