import java.io.*;
import java.util.*;

public class Solution {
    public static String netflix_sub(int x, int y, int z, int w){
        if(x+y >= w || y+z >= w || z+x >= w){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();
        
        System.out.println(netflix_sub(x,y,z,w));
        
    }
}
