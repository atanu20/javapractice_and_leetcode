package gfg;

import java.util.*;

public class Next_Permutation {

    public void swap(int[] a, int i, int j) {

        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

    public void rev(int[] a, int i, int n) {
        while (i < n)
            swap(a, i++, n--);
    }

    public void nextPermutation(int[] nums) {

        int idx1 = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }

        if (idx1 < 0) {
            Arrays.sort(nums);
        }

        else {

            int idx2 = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[idx1]) {
                    idx2 = i;
                    break;
                }
            }
            swap(nums, idx1, idx2);
            rev(nums, idx1 + 1, nums.length - 1);
        }

    }
}
