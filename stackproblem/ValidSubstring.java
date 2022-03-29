package stackproblem;

import java.util.*;

public class ValidSubstring {
    static int findMaxLen(String s) {

        Stack<Integer> st = new Stack<>();
        int lenn = 0;
        int n = s.length();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                st.pop();
                if (!st.isEmpty()) {
                    lenn = Math.max(lenn, i - st.peek());
                } else {
                    st.push(i);
                }

            } else {

                st.push(i);

            }
        }

        return lenn;

    }
}
