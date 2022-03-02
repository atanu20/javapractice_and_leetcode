package string;

import java.util.HashSet;
import java.util.*;

public class longest_substring_without_repetition {
    public static void main(String[] args) {
        String str = "abcdab";
        // String longest_tillnow = "";
        // String longest_overall = "";

        // Set<Character> set = new HashSet<>();
        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i);
        // if (set.contains(c)) {
        // longest_tillnow = "";
        // set.clear();

        // }
        // longest_tillnow += c;
        // set.add(c);
        // if (longest_overall.length() < longest_tillnow.length()) {
        // longest_overall = longest_tillnow;
        // }
        // }
        // System.out.println(longest_overall);

        int n = str.length();

        // Result
        int res = 0;

        for (int i = 0; i < n; i++) {

            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {

                // If current character is visited
                // Break the loop
                if (visited[str.charAt(j)] == true)
                    break;

                // Else update the result if
                // this window is larger, and mark
                // current character as visited.
                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }

            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
        System.out.println(res);
    }
}
