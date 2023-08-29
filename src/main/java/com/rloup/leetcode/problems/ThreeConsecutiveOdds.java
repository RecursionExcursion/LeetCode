package com.rloup.leetcode.problems;

public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {

        int oddStreak = 0;


        for (int i = 0; i < arr.length && oddStreak < 3; i++) {

            int x = arr[i];

            oddStreak = x % 2 == 0 ? 0 : oddStreak + 1;

        }

        return oddStreak == 3;
    }
}
