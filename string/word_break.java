package string;

import java.util.*;

public class word_break {
    public static int wordBreak(String A, ArrayList<String> B) {
        // code here
        return solve(A, B);
    }

    public static int solve(String s, ArrayList<String> dict) {

        // if (s.length() == 0)
        // return 1;

        // for (int i = 1; i <= s.length(); i++) {
        // if (dict.contains(s.substring(0, i))
        // && solve(s.substring(i, s.length()), dict) == 1) {
        // return 1;
        // }
        // }

        if (s.length() == 0)
            return 1;

        for (int i = 1; i <= s.length(); i++) {
            if (dict.contains(s.substring(0, i)) && solve(s.substring(i), dict) == 1) {
                return 1;
            }
        }

        // System.out.println("st:" + st);
        return 0;
    }

    public static void main(String[] args) {
        int n = 12;
        String[] B = { "i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice", "cream", "icecream",
                "man", "go", "mango" };
        String A = "ilike";
        ArrayList<String> wordList = new ArrayList<>();
        for (String st : B) {
            wordList.add(st);
        }

        System.out.println(wordBreak(A, wordList));

    }
}
