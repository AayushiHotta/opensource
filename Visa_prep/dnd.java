import java.io.*;
import java.util.*;

public class Solution {
    
    public static int dnd(int[] arr, int n, int m){
        int num1 = 0, num2 = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] % m == 0){
                num1 += arr[i];
            } else {
                num2 += arr[i];
            }
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(dnd(arr,n,m));
    }
}
