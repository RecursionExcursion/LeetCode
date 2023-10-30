package com.rloup.leetcode.problems;

import java.util.Arrays;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        int l = stones.length;
        while (l > 1) {
            Arrays.sort(stones);
            stones[l - 2] = stones[l - 1] - stones[l - 2];
            stones = Arrays.copyOf(stones, --l);
        }
        return stones[0];
    }
}
