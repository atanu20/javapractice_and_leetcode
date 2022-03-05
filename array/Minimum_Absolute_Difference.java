package array;

import java.util.*;

public class Minimum_Absolute_Difference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            // List<Integer> l=new ArrayList<>();
            if (arr[i] - arr[i - 1] < min) {
                min = arr[i] - arr[i - 1];
            }
        }
        for (int i = 1; i < n; i++) {

            if (arr[i] - arr[i - 1] == min) {
                List<Integer> l = new ArrayList<>();
                l.add(arr[i - 1]);
                l.add(arr[i]);

                li.add(l);

            }
        }

        // System.out.println(min);
        // System.out.println(Arrays.toString(arr));
        return li;

    }
}
