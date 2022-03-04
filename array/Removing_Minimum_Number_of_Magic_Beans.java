package array;

import java.util.*;

public class Removing_Minimum_Number_of_Magic_Beans {
    public long minimumRemoval(int[] b) {
        Arrays.sort(b);
        int n = b.length;
        long sum = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += b[i];
            max = Math.max(max, (long) b[i] * (n - i));
        }
        return sum - max;
    }
}
