package io.cachola;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void twoSum1() {
        assertThat(Arrays.equals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9))).isTrue();
    }

    @Test
    void twoSum2() {
        assertThat(Arrays.equals(new int[]{1, 2}, TwoSum.twoSum(new int[]{3,2,4}, 6))).isTrue();
    }

    @Test
    void twoSum3() {
        assertThat(Arrays.equals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3,3}, 6))).isTrue();
    }
}