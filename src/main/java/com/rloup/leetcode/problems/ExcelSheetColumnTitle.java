package com.rloup.leetcode.problems;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {

        int n = 1000;

        System.out.println(convertToTitle(n));
    }

    public static String convertToTitle(int n) {


//        return n == 0 ? "" : convertToTitle(--n / 26) + (char) ('A' + (n % 26));

        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char)('A' + n % 26));
            n /= 26;
        }
        result.reverse();
        return result.toString();


    }
}
