import java.util.*;

public class OneFromThree {
    public static void main(String[] args) {
        // Given an array of non-negative elements of size N in which all element
        // appears thrice except one element which appears once. Find the element that
        // appears once?
        HashMap<Integer, Integer> m = new HashMap<>();
        int a[] = { 6, 2, 5, 2, 2, 6, 6 };
        int n = a.length;
        for (int i : a) {
            if (m.containsKey(i)) {
                int b = m.get(i);
                m.put(i, b + 1);

            } else {
                m.put(i, 1);
            }
        }

        // System.out.println(m); //{2=3, 5=1, 6=3}
        Set<Integer> keys = m.keySet();
        for (int key : keys) {
            if (m.get(key) == 1) {
                System.out.println(key);
            }
        }

    }
}
