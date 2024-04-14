package com.leetcode;

public class KTHLargestElement {

    public static int KthLargerElementUnsortedArray(int[] nums, int k) {

        int number = nums.length;
        int [] arr = sortingArray(nums);
        return arr[number - k];
    }

    public static int [] sortingArray(int [] nums){
        for(int i=0; i<nums.length; i++){
            int current=nums[i];
            int j = i-1;
            while(j>=0 && current<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 7, 8};
        int k = 4;
        System.out.println("Kth Largest Element :" +
                KthLargerElementUnsortedArray(nums, k));
    }
}
