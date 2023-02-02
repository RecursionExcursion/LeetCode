package com.rloup.leetcode.problems;

public class PowerOfFour {
    public static void main(String[] args) throws InterruptedException {
        int i = 16;
        System.out.println(isPowerOfFour(i));
//        for (int x = 1; ; x++) {
//
//
//            System.out.println("x is: " + x);
//            int ans = (int) Math.pow(4, x);
//            System.out.println(ans);
//
//
//            Thread.sleep(500);
//        }
    }

    public static boolean isPowerOfFour(int n) {
        long ans = -1;
        for (int i = 0; ans < n; i++) ans = (long) Math.pow(4, i);
        return ans > 0 && ans == n;
    }

    public static boolean isPowerOfFourRec(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        return isPowerOfFourRec(n / 4);
    }
}
