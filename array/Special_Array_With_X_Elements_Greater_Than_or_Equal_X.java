package array;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for (int i = 1; i < 1001; i++) {
            int co = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] >= i) {
                    co++;
                }
            }
            if (co == i)
                ans = i;
        }
        return ans;

        /*
         * int n=nums.length;
         * int b[]=new int[1001];
         * for(int v:nums)
         * {
         * b[v]++;
         * }
         * int total=n;
         * for(int i=0;i<1001;i++)
         * {
         * if(i==total)
         * return i;
         * total-=b[i];
         * }
         * return -1;
         */
    }
}
