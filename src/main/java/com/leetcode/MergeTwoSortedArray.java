package com.leetcode;

import java.util.Arrays;

public class MergeTwoSortedArray {

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


    public static int[] merge(int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] result = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
                k++;
            } else {
                result[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 10, 11};
        int[] b = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(a, b)));


    }
}
