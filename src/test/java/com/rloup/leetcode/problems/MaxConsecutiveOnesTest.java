package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

    @Test
    void findMaxConsecutiveOnes() {

        assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0,}));

    }
}