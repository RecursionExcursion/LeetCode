package com.rloup.leetcode.problems;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String n1 = "52";
        String n2 = "4206";
        String n3 = "35427";
        String n4 = "42506";

        System.out.println(largestNumber(n1));
        System.out.println(largestNumber(n2));
        System.out.println(largestNumber(n3));
        System.out.println(largestNumber(n4));
    }

    private static String largestNumber(String num) {


        int l = num.length();
        for (int i = l - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
