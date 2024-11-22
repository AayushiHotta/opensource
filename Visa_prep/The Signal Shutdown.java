import java.io.*;
import java.util.*;

public class Solution {
    public static int[][] updateGrid(int[][] grid, int n, int m){
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(rows[i] || cols[j]){
                    grid[i][j] = 0;
                }
            }
        }
        return grid;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int[][] updatedGrid = updateGrid(arr,n,m);
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(updatedGrid[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
