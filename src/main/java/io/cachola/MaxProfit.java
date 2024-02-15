package io.cachola;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int cheaper = Integer.MAX_VALUE;
        for (int price : prices) {
            cheaper = Math.min(cheaper, price);
            maxProfit = Math.max(maxProfit, price - cheaper);
        }
        return Math.max(maxProfit, 0);
    }
}
