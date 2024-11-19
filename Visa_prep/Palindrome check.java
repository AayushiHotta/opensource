import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPalindrome(String str){
        int low = 0, high = str.length() - 1;
        
        while(low <= high){
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if(isPalindrome(str)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
