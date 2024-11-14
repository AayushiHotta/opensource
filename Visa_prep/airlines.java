import java.io.*;
import java.util.*;

public class Solution {
    
    public static int min_planes(int x, int y){
        
        int passenger_occupied = x * 100;
        int remaining = y - passenger_occupied;
        
        return (int)Math.ceil((double)remaining / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(min_planes(x,y));
    }
}
