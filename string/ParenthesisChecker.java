package string;

import java.util.*;

public class ParenthesisChecker {

    static boolean ispar(String x) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                continue;
            }

            if (st.isEmpty())
                return false;

            char c;

            switch (ch) {
                case ')':

                    c = st.pop();
                    if (c == '{' || c == '[')
                        return false;
                    break;
                case '}':

                    c = st.pop();
                    if (c == '(' || c == '[')
                        return false;
                    break;
                case ']':

                    c = st.pop();
                    if (c == '(' || c == '{')
                        return false;
                    break;

            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        // String str = "{([)}";
        char a[] = { '{', '(', ')', ']' };
        String str = String.valueOf(a);

        if (ispar(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
