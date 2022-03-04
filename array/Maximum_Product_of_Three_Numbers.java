package array;

import java.util.*;

public class Maximum_Product_of_Three_Numbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int h = n - 1;
            while (l < h) {
                int x = nums[i] * nums[l] * nums[h];
                if (max <= x) {
                    max = x;
                    l++;
                    h--;
                } else {
                    l++;
                }

            }
        }
        return max;
    }
}
