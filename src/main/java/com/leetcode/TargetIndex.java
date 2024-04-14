package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetIndex {

    private static int[] targetSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] response = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                response[0] = map.get(diff);
                response[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return response;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 9};
        int target = 12;
        System.out.println(Arrays.toString(targetSum(nums, target)));

    }
}
