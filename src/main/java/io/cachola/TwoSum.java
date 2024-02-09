package io.cachola;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complementTarget = target - nums[i];
            if (map.containsKey(complementTarget)) {
                return new int[]{map.get(complementTarget), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
