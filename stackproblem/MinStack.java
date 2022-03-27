package stackproblem;

import java.util.*;

public class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (Integer i : stack) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
