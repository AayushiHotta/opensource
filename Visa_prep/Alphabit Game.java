import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isVowel(char ch){
        return "aeiou".indexOf(ch) != -1;
    }
    
    public static void countVowelsAndConsonants(String str){
        int vowels = 0;
        int consonants = 0;
        
        str = str.toLowerCase();
        
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                if(isVowel(ch)){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println(vowels+","+consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        countVowelsAndConsonants(input);
    }
}
