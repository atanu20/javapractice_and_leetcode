package search;

public class Find_maximum_or_minimum_sum_of_a_subarray_of_size_k {
    public static void main(String[] args) {
        int a[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        k = k - 1;
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int sum = 0;
        for (int i = right; i < n; i++) {
            sum += a[i];
            if (i >= k) {
                max = Math.max(sum, max);
                sum = sum - a[left];
                left++;
            }
        }
        System.out.println(max);

    }
}
