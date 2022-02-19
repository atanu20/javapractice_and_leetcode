package gfg;

import java.util.*;

//Best Time to Buy and Sell Stock III
public class Maximum_profit_by_buying_and_selling_a_share_atmost_twice {
    public int maxProfit(int[] arr) {
        // int first_buy = Integer.MIN_VALUE;
        // int first_sell = 0;
        // int second_buy = Integer.MIN_VALUE;
        // int second_sell = 0;

        // for (int i = 0; i < arr.length; i++) {

        // first_buy = Math.max(first_buy, -arr[i]);
        // first_sell = Math.max(first_sell, first_buy + arr[i]);
        // second_buy = Math.max(second_buy, first_sell - arr[i]);
        // second_sell = Math.max(second_sell, second_buy + arr[i]);

        // }
        // return second_sell;

        int n = arr.length;

        int res[] = new int[n];

        Arrays.fill(res, 0);

        int max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max)
                max = arr[i];

            res[i] = Math.max(res[i + 1], max - arr[i]);
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];

            res[i] = Math.max(res[i - 1], res[i] + arr[i] - min);
        }

        return res[n - 1];
    }
}
