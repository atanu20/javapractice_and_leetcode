package gfg;

public class Maximum_Product_Subarray {
    long maxProduct(int[] arr, int n) {
        // long max = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        // long mul = 1;

        // for (int j = i; j < n; j++) {
        // mul *= (long) arr[j];
        // if (mul > max) {
        // max = mul;
        // }

        // }
        // }
        // return max;

        long max = Integer.MIN_VALUE;
        long mul = 1;
        for (int i = 0; i < n; i++) {
            mul *= arr[i];

            if (max < mul) {
                max = mul;
            }
            if (mul == 0)
                mul = 1;
        }
        mul = 1;

        for (int i = n - 1; i >= 0; i--) {
            mul *= arr[i];

            if (max < mul) {
                max = mul;
            }
            if (mul == 0)
                mul = 1;
        }

        return max;

    }
}
