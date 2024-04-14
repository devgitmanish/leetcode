package com.leetcode;

import java.util.Map;

public class StockMarket {

    public static int maxProfit(int[] nums) {

        int profit = 0;
        int left = 0;

        if (nums.length == 0)
            return 0;

        for (int right = 1; right < nums.length; right++) {

            if (nums[left] < nums[right])
                profit = Math.max(profit, nums[right] - nums[left]);
            else
                left = right;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] stock = {2, 3, 6, 7, 9};
        System.out.println("Max Profit in Stock : " + maxProfit(stock));

    }
}
