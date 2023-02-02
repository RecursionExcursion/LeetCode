package com.rloup.leetcode.problems;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2, -2));
        System.out.println(myPow(.44528, 0));
        System.out.println(myPow(2, Integer.MIN_VALUE));
        System.out.println(myPow(-2, 2));

    }

    public static double myPow(double x, int n) {
        if (x < 0 && n < 0) {
            x = Math.abs(x);
            n = Math.abs(n);
        }
        if (n == 0 || Math.abs(x) == 1) return x > 0 ? 1 : -1;
        if (n == 1) return x;
        if (n < 0) x = x / (x * x);
        double sum = 1;
        for (int i = 0; i < Math.abs((double) n); i++) {
            sum *= x;
            if (Math.abs(sum) < .0000001) {
                sum = 0;
                break;
            }
        }
        return sum;
    }
}
