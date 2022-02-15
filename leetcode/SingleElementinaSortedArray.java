package leetcode;

public class SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        int n = nums.length;
        // for(int i=0;i<n;i++)
        // {
        // ans=ans^nums[i];
        // }
        // return ans;

        // 2nd

        int s = 0;
        int e = n - 1;
        if (e == 0)
            return nums[0];
        else if (nums[0] != nums[1])
            return nums[0];
        else if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        while (s <= e) {
            int mid = (s + e) / 2;

            if ((nums[mid] != nums[mid - 1]) && (nums[mid] != nums[mid + 1]))
                return nums[mid];
            else if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
