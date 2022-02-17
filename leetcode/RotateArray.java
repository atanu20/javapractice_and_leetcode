package leetcode;

public class RotateArray {
    public static void rev(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rev(nums, 0, n - k - 1);
        rev(nums, n - k, n - 1);
        rev(nums, 0, n - 1);

    }
}
