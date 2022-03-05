package array;

import java.util.*;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int ps = 0;
        int olen = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            ps += nums[i];

            if (map.containsKey(ps)) {
                int len = i - map.get(ps);
                olen = Math.max(olen, len);
            } else {
                map.put(ps, i);
            }
        }

        return olen;
    }
}
