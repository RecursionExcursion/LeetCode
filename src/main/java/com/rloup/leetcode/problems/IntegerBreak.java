package com.rloup.leetcode.problems;

public class IntegerBreak {

    public int integerBreak(int n) {

        double highestResult = -1;

        for (int i = n / 2; i <= n * 1.5; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    double pow = Math.pow(j, ((double) i / j - 1));
                    int lastMult = j + n - i;
                    if (lastMult == 0) lastMult = 1;
                    double v = lastMult > 0 ? pow * lastMult : pow / lastMult;
                    highestResult = Math.max(highestResult, v);
                }
            }
        }
        return (int) highestResult;
    }
}
