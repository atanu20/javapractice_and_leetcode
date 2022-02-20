package gfg;

import java.util.*;

public class Permutations {
    List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        backTracking(nums, nums.length, new ArrayList<>());
        return result;
    }

    void backTracking(int[] nums, int k, List<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < k; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            backTracking(nums, k, list);
            list.remove(list.size() - 1);
        }
    }
}
