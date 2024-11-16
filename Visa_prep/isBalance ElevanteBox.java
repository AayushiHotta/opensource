import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int leftWeight(int[] arr, int i){
        int sum = 0;
        for(int j = 0;j<i;j++){
            sum += arr[j];
        }
        return sum;
    }
    public static int rightWeight(int[] arr, int i){
        int sum = 0;
        for(int j = i+1;j<arr.length;j++){
            sum += arr[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0;i<n;i++){
            int left_weight = leftWeight(arr,i);
            int right_weight = rightWeight(arr,i);
            
            result[i] = Math.abs(left_weight - right_weight);
        }
        for(int i = 0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}
