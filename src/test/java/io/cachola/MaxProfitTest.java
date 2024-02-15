package io.cachola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    @Test
    void testMaxProfit_emptyArray() {
        int[] prices = {};
        int maxProfit = MaxProfit.maxProfit(prices);
        assertEquals(0, maxProfit);
    }

    @Test
    void testMaxProfit_singleElementArray() {
        int[] prices = {10};
        int maxProfit = MaxProfit.maxProfit(prices);
        assertEquals(0, maxProfit);
    }

    @Test
    void testMaxProfit_sortedNonDecreasingArray() {
        int[] prices = {10, 9, 8};
        int maxProfit = MaxProfit.maxProfit(prices);
        assertEquals(0, maxProfit);
    }

    @Test
    void testMaxProfit_sortedDecreasingArray() {
        int[] prices = {8, 9, 10};
        int maxProfit = MaxProfit.maxProfit(prices);
        assertEquals(2, maxProfit);
    }

}