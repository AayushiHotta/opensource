import java.io.*;
import java.util.*;

public class Solution {
    
    public static int vignesh_age(int x){
        return x-15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println(vignesh_age(x));
    }
}
