package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    private static LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    void lastStoneWeight() {

        int[] stones = {2, 7, 4, 1, 8, 1};
        int ans1 = lastStoneWeight.lastStoneWeight(stones);

        assertEquals(1, ans1);
    }
}