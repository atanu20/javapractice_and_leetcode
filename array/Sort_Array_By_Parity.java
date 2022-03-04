package array;

public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];

        int l = 0, h = n - 1;
        int i = 0;
        while (i < n) {
            if (nums[i] % 2 == 0) {
                a[l++] = nums[i];
            } else {
                a[h--] = nums[i];
            }
            i++;
        }
        return a;
    }
}
