package com.leetcode;

import java.util.Arrays;

public class ReverseArray {

    public static int [] reverseArray(int [] nums){

        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }


    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(reverseArray(arr)));

    }
}
