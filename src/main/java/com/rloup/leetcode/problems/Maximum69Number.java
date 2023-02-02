package com.rloup.leetcode.problems;

public class Maximum69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9996));
        System.out.println(maximum69Number(9999));
    }

    public static int maximum69Number(int num) {

        char[] chars = String.valueOf(num).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 54) {
                chars[i] = (char) 57;
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
