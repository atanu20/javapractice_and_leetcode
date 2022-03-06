package array;

import java.util.*;

public class tri_Sum_Closest {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int sol = 0;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int h = n - 1;
            int diff = target - nums[i];
            while (l < h) {
                int sum = diff - nums[l] - nums[h];
                int absSum = Math.abs(sum);
                if (absSum < min) {
                    min = absSum;
                    sol = target - sum;
                }

                if (absSum == 0)
                    return sol;
                else if (sum > 0) {
                    l++;
                } else {
                    h--;
                }

            }
        }

        return sol;

    }
}
