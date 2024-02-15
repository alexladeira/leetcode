package io.cachola;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > 0 && diff > max) {
                    max = diff;
                }
            }
        }
        return max;
    }
}
