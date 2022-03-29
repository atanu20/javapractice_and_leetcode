package stackproblem;

import java.util.*;

public class Delete_middle_element_of_a_stack {
    public void deleteMid(Stack<Integer> s, int N) {
        // Queue<Integer>ans =new LinkedList<Integer>();
        Stack<Integer> ans = new Stack<>();

        int mid = N / 2;
        int i = 0;

        while (!s.isEmpty()) {
            while (i < mid && !s.isEmpty()) {
                ans.push(s.pop());
                i++;
            }
            s.pop();
            while (!s.isEmpty()) {
                ans.push(s.pop());
            }

        }

        // System.out.println(ans.toString());

        while (!ans.isEmpty()) {
            s.push(ans.pop());
        }

    }
}
