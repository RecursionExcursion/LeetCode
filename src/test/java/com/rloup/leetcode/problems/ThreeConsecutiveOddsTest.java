package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeConsecutiveOddsTest {

    private static final ThreeConsecutiveOdds threeConsecutiveOdds = new ThreeConsecutiveOdds();
    @Test
    void threeConsecutiveOdds() {

        boolean b1 = threeConsecutiveOdds.threeConsecutiveOdds(new int[]{2, 6, 4, 1});
        boolean b2 = threeConsecutiveOdds.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12});

        assertFalse(b1);
        assertTrue(b2);

    }
}