import java.io.*;
import java.util.*;

public class Solution {
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void reverse(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        reverse(arr);
        
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
