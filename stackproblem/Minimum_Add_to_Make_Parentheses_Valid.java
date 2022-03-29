package stackproblem;

import java.util.*;

public class Minimum_Add_to_Make_Parentheses_Valid {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);

            } else {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }

        }
        return st.size();

        // int n=s.length();
        // int opencount=0, invalidcount=0;
        // for(int i=0;i<n;i++)
        // {
        // char ch=s.charAt(i);

        // if(ch=='(')
        // {
        // opencount++;

        // }else if(ch==')')
        // {
        // if(opencount==0)
        // {
        // invalidcount++;
        // }else{
        // opencount--;
        // }
        // }
        // }
        // return opencount+invalidcount;

    }
}
