package stackproblem;

import java.util.*;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (st.size() != 0) {
                    ans.append('(');
                }
                st.push(ch);
            } else {
                st.pop();
                if (st.size() != 0) {
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }

}