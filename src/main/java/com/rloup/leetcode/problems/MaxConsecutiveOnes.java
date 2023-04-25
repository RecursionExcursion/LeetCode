package com.rloup.leetcode.problems;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = -1,cur = 0;
        for (int i : nums) {
            if (i == 1) cur++;
            else {
                max = Math.max(max, cur);
                cur = 0;
            }
        }
        return Math.max(max, cur);
    }
}
