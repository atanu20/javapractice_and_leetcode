package array;

public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        // a[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(a);
        // return a;

        int l = 0, h = n - 1;
        int p = n - 1;
        while (l <= h) {
            if (Math.abs(nums[l]) > Math.abs(nums[h])) {
                a[p] = nums[l] * nums[l];
                l++;
            } else {
                a[p] = nums[h] * nums[h];
                h--;
            }
            p--;
        }
        return a;
    }
}
