package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeUnsortedArrayToSortedArray {

    public static int[] sortingArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && current < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
        return nums;
    }

    public static int[] mergeSortedArray(int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }

    public static int[] sortArray(int a[], int b[], int res[], int n, int m) {
        int i = 0, j = 0, k = 0;
        while (i < n) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = b[j];
            j++;
            k++;
        }
        Arrays.sort(res);
        return res;
    }


    public static void main(String[] args) {

        int a[] = {6, 4, 7, 2, 1};
        int b[] = {8, 9, 3, 5, 10};

        int[] sortArray1 = sortingArray(a);
        int[] sortArray2 = sortingArray(b);

        System.out.println("Merge two unsorted Array....");
        System.out.println(Arrays.toString(mergeSortedArray(sortArray1, sortArray2)));

        /*way 2 with predefined funtion*/

        int res[] = new int[a.length + b.length];
        System.out.println("Merge two unsorted Array....");
        System.out.println(Arrays.toString(sortArray(a, b, res, a.length, b.length)));


    }
}
