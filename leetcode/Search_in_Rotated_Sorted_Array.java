package leetcode;

public class Search_in_Rotated_Sorted_Array {
    public static int bSearch(int[] nums, int st, int hi, int k) {
        int l = st;
        int h = hi;
        while (l <= h) {
            int mid = (l + h) / 2;

            if (nums[mid] == k)
                return mid;
            else if (nums[mid] > k) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;

    }

    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
        // {
        // if(nums[i]==target)
        // {
        // return i;
        // }
        // }
        // return -1;

        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int index = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                index = mid;
                break;
            }

            if (mid < n - 1 && nums[mid] > nums[mid + 1]) {
                index = mid + 1;
                break;
            }

            if (nums[l] <= nums[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }

        int a = bSearch(nums, 0, index - 1, target);
        int b = bSearch(nums, index, n - 1, target);
        // System.out.println(b);

        return a == -1 ? b : a;

    }
}
