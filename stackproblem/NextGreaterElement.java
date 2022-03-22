package stackproblem;

import java.util.*;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] a = new long[n];
        Stack<Long> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (!s.isEmpty()) {
                while (!s.isEmpty() && s.peek() <= arr[i]) {
                    s.pop();
                }
            }

            if (s.isEmpty()) {
                a[i] = -1;
            } else {
                a[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return a;
    }
}
