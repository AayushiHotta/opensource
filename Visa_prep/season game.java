import java.io.*;
import java.util.*;

public class Solution {
    
    public static String season(int month){
        if(month >= 3 && month <= 5){
            return "Spring";
        }else if(month >= 6 && month <=8){
            return "Summer";
        }else if(month >= 9 && month <= 11){
            return "Autumn";
        } else if(month == 12 || month == 1 || month == 2){
            return "Winter";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        
        System.out.println(season(month));
    }
}
