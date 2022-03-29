package stackproblem;

public class Design_a_Stack_With_Increment_Operation {
    int[] stack;
    int top = -1;

    public Design_a_Stack_With_Increment_Operation(int maxSize) {
        stack = new int[maxSize];
    }

    public void push(int x) {
        if (top != stack.length - 1) {
            stack[++top] = x;
        }
    }

    public int pop() {
        if (top != -1) {
            return stack[top--];
        }
        return -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(top + 1, k); i++) {
            stack[i] += val;
        }
    }
}
