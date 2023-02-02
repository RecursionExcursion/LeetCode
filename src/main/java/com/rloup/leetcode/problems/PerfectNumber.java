package com.rloup.leetcode.problems;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
        System.out.println(checkPerfectNumber(6));
        System.out.println(checkPerfectNumber(99999999));
        System.out.println();
        System.out.println(checkPerfectNumber2(28));
        System.out.println(checkPerfectNumber2(7));
        System.out.println(checkPerfectNumber2(6));
        System.out.println(checkPerfectNumber2(99999999));

    }

    private static boolean checkPerfectNumber(int num) {
        //Too Slow Apparently
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return num == sum;
    }

    private static boolean checkPerfectNumber2(int num) {
        if (num == 0 || num == 1) return false;
        int sum = 1, cap = num;
        for (int i = 2; i < cap; i++) {
            if (num % i == 0) {
                cap = num / i;
                sum += cap + i;
            }
        }
        return num == sum;
    }
}
