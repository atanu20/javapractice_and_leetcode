package array;

public class Count_Special_Quadruplets {
    public int countQuadruplets(int[] nums) {

        // int count = 0, n = nums.length;
        // for (int i = 0; i < n - 3; i++) {
        // for (int j = i + 1; j < n - 2; j++) {
        // for (int k = j + 1; k < n - 1; k++) {
        // for (int l = k + 1; l < n; l++) {
        // if (nums[l] == nums[i] + nums[j] + nums[k]) {
        // count++;
        // }
        // }
        // }
        // }
        // }
        // return count;

        int count = 0;
        int[] m = new int[201]; // max nums value is 100 so two elements sum can be max 200
        for (int i = 1; i < nums.length - 2; i++) {
            for (int j = 0; j < i; j++)
                m[nums[j] + nums[i]]++; // update all possible 2 sums
            for (int j = i + 2; j < nums.length; j++) {
                int diff = nums[j] - nums[i + 1]; // fix third element and search for fourth - third in 2 sums as a + b
                                                  // + c = d == a + b = d - c
                if (diff >= 0)
                    count += m[diff];
            }
        }
        return count;
    }
}
