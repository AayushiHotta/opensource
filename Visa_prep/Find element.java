import java.io.*;
import java.util.*;

public class Solution {
    
    public static int binarySearch(int[] arr, int left, int right,int key){
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        
        if(arr[mid] == key){
            return mid;
        }
        if(key < arr[mid]){
            return binarySearch(arr,left,mid - 1, key);
        }
        
        return binarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        int result = binarySearch(arr, 0, n-1, target);
        
        System.out.println(result);
    }
}
