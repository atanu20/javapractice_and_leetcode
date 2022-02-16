package leetcode;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {

        int n = nums.length;
        int l = 0;
        int h = n - 1;

        // if(h==0)
        // return nums[0];
        // else if(nums[0]>nums[1])
        // return nums[1];
        // else if(nums[n-1]<nums[n-2])
        // return nums[n-1];

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1])
                return nums[mid];
            if (mid < n - 1 && nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[l] <= nums[mid])
                l = mid + 1;
            else if (nums[h] >= nums[mid])
                h = mid - 1;

        }
        return nums[0];
    }
}
