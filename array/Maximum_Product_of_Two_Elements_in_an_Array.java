package array;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int p=(nums[n-1]-1)*(nums[n-2]-1);
        // return p;

        int max = 0;
        int smax = -1;

        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[max] < nums[i]) {
                smax = max;
                max = i;

            } else if (smax == -1 || nums[smax] < nums[i]) {
                smax = i;
            }
        }
        int p = (nums[max] - 1) * (nums[smax] - 1);
        return p;
    }
}
