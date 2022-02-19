
package gfg;

import java.util.*;

public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        int val = n / 3;
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            boolean check = m.getValue() > val;
            if (check) {
                l.add(m.getKey());
            }

        }

        return l;
    }
}
