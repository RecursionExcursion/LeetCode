package com.rloup.leetcode.problems;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        System.out.println(guessNumber(5));
        System.out.println(guessNumber(1000));
        System.out.println(guessNumber(100));

    }

    private static int guessNumber(int n) {

        for (int i = guess(n), min = 1, max = Integer.MAX_VALUE; i != 0; i = guess(n)) {
            if (i == -1) max = n;
            else min = n;
            n = (max - min) / 2 + min;
        }
        return n;

    }

    private static int guess(int n) {
        return Integer.compare(100, n);
    }
}
