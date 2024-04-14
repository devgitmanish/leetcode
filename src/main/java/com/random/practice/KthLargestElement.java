package com.random.practice;

import java.util.Arrays;

public class KthLargestElement {

    public static int KthLargerstElement(int [] nums, int k){

        //Arrays.sort(nums);
        int [] sortedArray = sortingArray(nums);
        int number = nums.length;
        return sortedArray[number-k];
    }

    public static int [] sortingArray(int [] nums){

        for(int i=0;i<nums.length; i++){

            int current=nums[i];
            int j = i-1;
            while(j>=0 && current<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]= current;
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {4, 2, 3, 7, 6, 5};
        // 2, 3, 4, 5, 6, 7
        System.out.println(KthLargerstElement(nums, 3));

    }
}
