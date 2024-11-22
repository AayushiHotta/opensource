import java.io.*;
import java.util.*;

public class Solution {
    
    public static String toggleCase(String str){
        StringBuilder toggled = new StringBuilder();
        
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                toggled.append(Character.toLowerCase(ch));
            } else if(Character.isLowerCase(ch)){
                toggled.append(Character.toUpperCase(ch));
            }
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String result = toggleCase(str);
        
        System.out.println(result);
    }
}
