import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos_count = 0;
        int zero_count = 0;
        int neg_count = 0;
        
        for(int i = 0;i<n;i++){
            if(arr[i] > 0){
                pos_count++;
            } else if(arr[i] < 0){
                neg_count++;
            } else {
                zero_count++;
            }
        }
        
        System.out.printf("%.6f\n",((double)pos_count/n));
        System.out.printf("%.6f\n",((double)neg_count/n));
        System.out.printf("%.6f\n",((double)zero_count/n));
    }
}
