package com.leetcode;

public class LongestSubString {

    public static String longestPlaindromeSubString(String str) {

        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {

            int length1 = expandFromCenter(str, i, i + 1);
            int length2 = expandFromCenter(str, i, i);
            int maxLength = Math.max(length1, length2);

            if ((end - start) < maxLength) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return str.substring(start, end + 1);
    }

    public static int expandFromCenter(String str, int i, int j) {
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPlaindromeSubString("baab"));
    }


}
