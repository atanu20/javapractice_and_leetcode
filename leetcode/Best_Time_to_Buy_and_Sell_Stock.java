package leetcode;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        // int max=0;
        // int n=prices.length;

        // for(int i=0;i<n-1;i++)
        // {
        // for(int j=i+1;j<n;j++)
        // {
        // if(max<(prices[j]-prices[i]) && prices[j]>prices[i])
        // {
        // max=prices[j]-prices[i];
        // }
        // }
        // }
        // return max;

        int max = Integer.MIN_VALUE;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - min;
            if (profit > max)
                max = profit;

            if (min > prices[i])
                min = prices[i];

        }
        return max;
    }
}
