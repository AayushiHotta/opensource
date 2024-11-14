import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //total bill amount -> x
        double x = sc.nextDouble();
        //Coupons 
        
        //Get 10 percent off on the bill amount
        double coupon1 = x - (0.1 * x);
        //Get flat discount of 100
        double coupon2 = x - 100;
        
        if(coupon1 < coupon2){
            System.out.println((int)coupon1);
        }else{
            System.out.println((int)coupon2);
        }
    }
}
