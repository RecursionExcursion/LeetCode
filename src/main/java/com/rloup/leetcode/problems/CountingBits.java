package com.rloup.leetcode.problems;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int i = 5;
        int i2 = 1;
        int i3 = 2;

        System.out.println(Arrays.toString(countBits(i)));
        System.out.println(Arrays.toString(countBits(i2)));
        System.out.println(Arrays.toString(countBits(i3)));
    }

    public static int[] countBits(int n) {

        int[] ones = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String x = Integer.toBinaryString(i);

            for (String s : x.split("")) {
                if (Integer.parseInt(s) == 1) {
                    ones[i]++;
                }
            }
        }
        return ones;
    }

    public static int[] countBits2(int n) {

        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i / 2] + i % 2;
        }

        return ans;
    }

    public static int[] countBits3(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = f[i >> 1] + (i & 1);
        }
        return f;
    }
}

