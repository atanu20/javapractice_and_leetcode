package gfg;

public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (target <= sum) {
                    minlen = Math.min(minlen, j - i + 1);
                }
            }
        }

        return minlen == 2147483647 ? 0 : minlen;
    }
}
