package leetcode;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int t) {
        int a[] = new int[2];
        a[0] = -1;
        a[1] = -1;
        int n = nums.length;

        int low = 0;
        int end = n - 1;
        // first occ
        while (low <= end) {
            int mid = low + (end - low) / 2;
            if (nums[mid] == t) {
                a[0] = mid;
                end = mid - 1;
            } else if (nums[mid] > t) {
                end = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // last occ

        low = 0;
        end = n - 1;
        while (low <= end) {
            int mid = low + (end - low) / 2;
            if (nums[mid] == t) {
                a[1] = mid;
                low = mid + 1;
            } else if (nums[mid] > t) {
                end = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return a;

    }
}
