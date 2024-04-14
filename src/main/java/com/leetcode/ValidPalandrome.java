package com.leetcode;

public class ValidPalandrome {

    public static boolean validPalandrome(String str){

        char [] ch = str.toLowerCase().toCharArray();
        int start=0;
        boolean flag=true;
        int end = str.length()-1;
        while(start<=end){
            if(ch[start]!=ch[end]){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }

    public static void main(String[] args) {
        //String str = "racecar";
        String str = "RAcecar";
        System.out.println(validPalandrome(str));

    }
}
