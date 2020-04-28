
package anagrams;

import java.util.Scanner;

public class anagram {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String a = in.next();
                String b = in.next();
                isAngram(a, b);
        }

        static boolean isAnagram(String a, String b) {
                int a_length = a.length();
                int b_length = b.length();
                if (a_length != b_length)
                        return false;

                a = a.toLowerCase();
                b = b.toLowerCase();

                int[] char_frequency = new int[30];
                for (int i = 0; i < a_length; i++) {
                        char current_char = a.charAt(i);
                        int index = current_char - 'a';
                        char_frequency[index]++;
                }
                for (int i = 0; i < b_length; i++) {
                        char current_char = b.charAt(i);
                        int index = current_char - 'a';
                        char_frequency[index]--;
                }
                for (int i = 0; i < 30; i++) {
                        if (char_frequency[i] != 0)
                                return false;
                }
                return true;

        }
}

~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
anagram.java [dos] (01:39 16/04/2020)                                                                                                                                                                   41,0-1 All
"anagram.java" [dos] 41L, 891C

