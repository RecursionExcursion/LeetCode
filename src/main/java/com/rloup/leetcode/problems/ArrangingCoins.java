package com.rloup.leetcode.problems;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(3));
        System.out.println(arrangeCoins(8));
    }

    public static int arrangeCoins(int n) {
        int take = 1;
        int rows = 0;
        while (take <= n) {
            n -= take++;
            rows++;
        }
        return rows;
    }
}
