package stackproblem;

import java.util.*;

public class Queue_Reversal {
    public Queue<Integer> rev(Queue<Integer> q) {
        // Queue<Integer> qq=new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }

        return q;
    }
}
