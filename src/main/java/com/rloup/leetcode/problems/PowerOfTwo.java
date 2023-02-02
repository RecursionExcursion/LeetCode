package com.rloup.leetcode.problems;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 16;
        int num3 = 32;
        int num4 = 3;
        int num5 = 2147483647;


        System.out.println(isPowerOfTwo(num1));
        System.out.println(isPowerOfTwo(num2));
        System.out.println(isPowerOfTwo(num3));
        System.out.println(isPowerOfTwo(num4));
        System.out.println(isPowerOfTwo(num5));
    }

    public static boolean isPowerOfTwo(int n) {
        int i = 0;
        double sum = 1;
        while (sum <= n) {
            sum = Math.pow(2, i);
            if (sum == n) return true;
            i++;
        }
        return false;
    }
}