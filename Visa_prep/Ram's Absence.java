import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0, max = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                count++;
            } else {
                count = 0;
            }
            
            max = Math.max(count, max);
        }
        System.out.println(max);
        
    }
}
