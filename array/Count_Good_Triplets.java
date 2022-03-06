package array;

public class Count_Good_Triplets {
    public int countGoodTriplets(int[] nums, int a, int b, int c) {
        int count = 0, n = nums.length;

        for (int j = 0; j < n - 2; j++) {
            for (int k = j + 1; k < n - 1; k++) {
                if (Math.abs(nums[j] - nums[k]) <= a) {
                    for (int l = k + 1; l < n; l++) {
                        if (Math.abs(nums[k] - nums[l]) <= b) {
                            if (Math.abs(nums[j] - nums[l]) <= c)
                                count++;
                        }
                    }
                }

            }
        }

        return count;
    }
}
