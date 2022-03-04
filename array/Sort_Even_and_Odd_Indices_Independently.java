package array;

import java.util.*;

public class Sort_Even_and_Odd_Indices_Independently {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);

        int[] ans = new int[nums.length];
        int j = 0, k = odd.size() - 1;
        for (int i = 0; i < ans.length; i++) {
            if (i % 2 == 0) {
                ans[i] = even.get(j);
                j++;
            } else {
                ans[i] = odd.get(k);
                k--;
            }
        }
        return ans;
    }
}
