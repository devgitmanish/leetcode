package com.leetcode;

import java.util.Arrays;

public class SortingArray {

    public static int[] sortingArray(int [] nums){

        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            int j=i-1;

            while(j>=0 && current<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        return nums;
    }


    public static void main(String[] args) {
        int [] nums = {6, 4, 2, 7, 1, 9};
        System.out.println("Sorted Array "+ Arrays.toString(sortingArray(nums)));

    }
}
