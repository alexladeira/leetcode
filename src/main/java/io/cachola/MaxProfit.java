package io.cachola;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int cheaper = Integer.MAX_VALUE;
        for (int price : prices) {
            if (cheaper > price) {
                cheaper = price;
            }
            if (maxProfit < price - cheaper) {
                maxProfit = price - cheaper;
            }
        }
        return Math.max(maxProfit, 0);
    }
}
