package stackproblem;

import java.util.*;

public class Remove_K_Digits {
    public String removeKdigits(String S, int k) {
        if (k == 0)
            return S;
        if (S.length() <= k)
            return "0";
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            if (!st.isEmpty() || ch != '0') {
                st.push(ch);
            }
        }
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) {
            return "0";
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());

        }

        String str = sb.reverse().toString();
        return str;
    }
}
