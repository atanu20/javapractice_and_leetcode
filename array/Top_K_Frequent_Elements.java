package array;

import java.util.*;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        int n = nums.length;
        for (int v : nums) {
            m.put(v, m.getOrDefault(v, 0) + 1);
        }
        System.out.println(m);
        var s = new ArrayList<>(m.entrySet());
        s.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println(s);
        var res = new int[k];
        for (var x : s) {
            res[--k] = x.getKey();
            if (k == 0)
                break;
        }

        return res;

    }
}
