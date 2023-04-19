package com.rloup.leetcode.problems;

import java.util.stream.IntStream;

public class IntegerBreak {

    public int integerBreak2(int n) {
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

    public int integerBreak(int n) {
        return IntStream.range(n / 2, (int) (n * 1.5))
                        .mapToObj(i -> IntStream.range(1, i)
                                                .filter(j -> i % j == 0)
                                                .mapToObj(j -> {
                                                    int pow = (int) Math.pow(j, ((double) i / j - 1));
                                                    int c = j + n - i, lastMult = c == 0 ? 1 : c;
                                                    return lastMult > 0 ? pow * lastMult : pow / lastMult;
                                                }))
                        .map(s -> s.max(Integer::compare).orElse(-1))
                        .max(Double::compare)
                        .orElse(-1);
    }
}
