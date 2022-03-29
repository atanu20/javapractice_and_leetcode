package stackproblem;

import java.util.*;

public class Sort_a_stack {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (s.size() == 1)
            return s;
        int temp = s.peek();
        s.pop();
        sort(s);
        insertAt(s, temp);
        return s;
    }

    public void insertAt(Stack<Integer> s, int temp) {
        if (s.size() == 0 || s.peek() <= temp) {
            s.push(temp);
            return;
        }
        int val = s.peek();
        s.pop();
        insertAt(s, temp);
        s.push(val);
        return;

    }
}
