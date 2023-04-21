package com.rloup.leetcode.problems;

public class IntegerReplacement {
    public int integerReplacement(int n) {
        return getOps(n, 0);
    }

    private int getOps(double x, int i) {
        return x == 1 ? i : x % 2 == 0 ? getOps(x / 2, ++i) : Math.min(getOps(x - 1, ++i), getOps(x + 1, i));
    }
}
