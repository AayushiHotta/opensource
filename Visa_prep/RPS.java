import java.io.*;
import java.util.*;

public class Solution {
    
    public static String RPS(char v, char c){
        if(v == c){
            return "NULL";
        }
         else if((v == 'R' && c == 'P')||(v == 'P' && c == 'S')||(v == 'S' && c == 'R') ){
            return "Charan";
        } else {
            return "Vignesh";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char vignesh = sc.next().charAt(0);
        char charan = sc.next().charAt(0);
        
        System.out.println(RPS(vignesh, charan));
    }
}
