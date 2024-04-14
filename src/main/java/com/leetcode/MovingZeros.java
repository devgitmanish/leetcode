package com.leetcode;

import java.util.Arrays;

public class MovingZeros {

    public static int[] movingZeros(int[] nums) {

        int left = 0;
        for (int right = 0; right < nums.length; right++)
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }

        for(int i=left; i<nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 5, 6, 0, 3, 0};
        System.out.println("Moving Zeros "+ Arrays.toString(movingZeros(nums)));

    }
}
