package array;

import java.util.*;

public class Permutations_of_a_given_array {
    static List<List<Integer>> result;

    static void printall(int[] a, int n, List<Integer> list) {
        if (list.size() == n) {
            result.add(new ArrayList<>(list));
            // System.out.println(list);
            return;
        }

        for (int i = 0; i < n; i++) {
            // System.err.print(a[i] + " ");
            if (list.contains(a[i])) {
                continue;
            }
            list.add(a[i]);
            // System.out.println(list.get(0));
            // System.out.println(list.size() - 1);
            printall(a, n, list);
            list.remove(list.size() - 1);
            // System.err.println(list);
        }
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 3 };
        int n = a.length;
        result = new ArrayList<>();
        printall(a, n, new ArrayList<>());
        System.out.println(result);
    }
}
