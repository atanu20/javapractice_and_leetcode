package stackproblem;

import java.util.*;

public class Reverse_each_word_in_a_given_string {
    String reverseWords(String str) {
        // String[] arrOfStr = s.split("\\.");
        // String ans="";
        // int n=arrOfStr.length;
        // int i=0;
        // for (String a : arrOfStr)
        // {
        // StringBuffer sa = new StringBuffer();
        // sa.append(a);

        // ans+=sa.reverse().toString();
        // if(i!=n-1)
        // {
        // ans+=".";
        // }
        // i++;

        // }

        // return ans;

        // StringBuffer s = new StringBuffer(str);
        // str = s.reverse().toString();
        // String [] rev = str.split("\\.");
        // int n=rev.length,f=0;
        // StringBuffer reverse = new StringBuffer();
        // for(int i = rev.length - 1; i >= 0; i--) {
        // if(f!=n-1)
        // {
        // reverse.append(rev[i]).append(".");
        // }

        // else{
        // reverse.append(rev[i]);
        // }
        // f++;
        // }
        // return reverse.toString();

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '.') {
                st.push(ch);
            } else {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                sb.append('.');
            }

        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();

    }
}
