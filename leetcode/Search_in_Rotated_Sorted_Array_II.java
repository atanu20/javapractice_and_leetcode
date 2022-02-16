package leetcode;

public class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
        // {
        // if(nums[i]==target)
        // {
        // return true;
        // }
        // }
        // return false;

        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int index = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] == nums[l] && nums[mid] == nums[h]) {
                l++;
                h--;
            }

            else if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }

            } else {
                if (nums[h] >= target && target > nums[mid]) {
                    l = mid + 1;
                } else {

                    h = mid - 1;
                }
            }

        }

        return false;
    }
}
