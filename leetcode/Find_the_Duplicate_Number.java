package leetcode;

public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        // List<Integer> l = new ArrayList<Integer>();
        // int t = 0;
        // for (int i = 0; i < a.length; i++) {
        // if (!l.contains(a[i])) {
        // l.add(a[i]);
        // } else {
        // t = a[i];
        // }
        // }

        // return t;

        // Arrays.sort(nums);
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] == nums[i-1])
        // return nums[i];
        // }

        // return -1;

        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int count = 0;
            for (int v : nums) {
                if (v <= mid)
                    count++;
            }

            if (count <= mid)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return l;
    }
}
