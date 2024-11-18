import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int d1 = 0;
        int d2 = 0;
        for(int i = 0;i<n;i++){
            d1 += matrix[i][i];
            d2 += matrix[i][n-i-1];
        }
        System.out.println( Math.abs(d1-d2));
    }
}
