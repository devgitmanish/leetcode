package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddedTwoArray {

    public static int[] addedTwoArray(int[] num1, int[] num2) {

        int maxLength = Math.max(num1.length, num2.length);
        int[] result = new int[maxLength + 1];
        int carry = 0;

        int i = num1.length - 1;
        int j = num2.length - 1;
        int k = result.length - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1[i];
                i--;
            }
            if (j >= 0) {
                sum += num2[j];
                j--;
            }
            result[k] = sum % 10;
            carry = sum / 10;
            k--;
        }
        if (carry > 0)
            result[k] = carry;
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 8, 9};
        int[] arr2 = {9, 9};

        System.out.println(Arrays.toString(addedTwoArray(arr1, arr2)));
    }
}
