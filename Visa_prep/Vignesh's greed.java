import java.io.*;
import java.util.*;

public class Solution {
    
    public static int max_triangle_perimeter(int n, int[] sticks){
        Arrays.sort(sticks);
        for(int i = n-1;i>=2;i--){
            if(sticks[i-2] + sticks[i-1] > sticks[i]){
                return sticks[i-2] + sticks[i-1] + sticks[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(max_triangle_perimeter(n,arr));
    }
}
