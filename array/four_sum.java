package array;

import java.util.*;

public class four_sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = n - 1; j >= 3; j--) {
                int left = i + 1, right = j - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        s.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return new ArrayList<>(s);
    }
}
