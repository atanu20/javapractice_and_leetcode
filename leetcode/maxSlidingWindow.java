package leetcode;

import java.util.*;

public class maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int ans[] = new int[nums.length - k + 1];
        int z = 0;

        int i = 0;
        int j = 0;

        Deque<Integer> bag = new LinkedList<>();

        while (j < nums.length) {
            while (!bag.isEmpty() && bag.peekLast() < nums[j]) {
                bag.removeLast();
            }
            bag.add(nums[j]);

            if ((j - i + 1) == k) {
                // window size hitted
                ans[z++] = bag.peek();
                if (nums[i] == bag.peek())
                    bag.removeFirst();
                i++;
            }

            j++;
        }

        return ans;
    }
}
