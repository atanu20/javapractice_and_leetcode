package array;

import java.util.*;

public class Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int a[] = new int[n1];

        for (int v : arr2) {
            m.put(v, 0);

        }

        for (int i = 0; i < n1; i++) {
            if (m.containsKey(arr1[i])) {
                m.put(arr1[i], m.get(arr1[i]) + 1);

            } else {
                li.add(arr1[i]);
            }
        }
        int p = 0;

        for (int v : arr2) {
            int l = m.get(v);
            for (int j = 0; j < l; j++) {
                a[p++] = v;
                m.put(v, m.get(v) - 1);
            }
        }
        Integer[] ar = new Integer[li.size()];
        ar = li.toArray(ar);

        Arrays.sort(ar);
        for (int v : ar) {
            a[p++] = v;
        }

        // System.out.println(m);
        return a;
    }
}
