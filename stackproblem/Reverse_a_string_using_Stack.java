package stackproblem;

import java.util.*;

public class Reverse_a_string_using_Stack {
    public String reverse(String s) {
        Stack<Character> st = new Stack<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            st.push(ch);
        }
        String ss = "";
        while (!st.isEmpty()) {
            ss += st.pop();
        }
        return ss;

    }
}
