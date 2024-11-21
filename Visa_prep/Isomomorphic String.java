import java.io.*;
import java.util.*;

public class Solution {
    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Character> mapS1ToS2 = new HashMap<>();
        HashMap<Character, Character> mapS2ToS1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);

            if (mapS1ToS2.containsKey(char1)) {
                if (mapS1ToS2.get(char1) != char2) {
                    return false;
                }
            } else {
                mapS1ToS2.put(char1, char2);
            }
            if (mapS2ToS1.containsKey(char2)) {
                if (mapS2ToS1.get(char2) != char1) {
                    return false;
                }
            } else {
                mapS2ToS1.put(char2, char1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (areIsomorphic(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
