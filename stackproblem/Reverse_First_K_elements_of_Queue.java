package stackproblem;

import java.util.*;

public class Reverse_First_K_elements_of_Queue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> ans = new LinkedList<Integer>();
        Stack<Integer> st = new Stack<>();

        int i = 0;
        while (!q.isEmpty()) {
            while (i < k && !q.isEmpty()) {
                st.push(q.poll());
                i++;
            }
            while (!q.isEmpty()) {
                ans.offer(q.poll());
            }

        }

        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
        while (!ans.isEmpty()) {
            q.offer(ans.poll());
        }

        return q;

    }
}
