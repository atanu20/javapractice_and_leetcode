package gfg;

public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n) {

        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }
}
