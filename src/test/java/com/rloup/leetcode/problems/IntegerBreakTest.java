package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBreakTest {

    private final IntegerBreak integerBreak = new IntegerBreak();

    @Test
    void integerBreak() {
        assertEquals(36, integerBreak.integerBreak(10));
        assertEquals(1, integerBreak.integerBreak(2));
        assertEquals(2, integerBreak.integerBreak(3));
        assertEquals(1458, integerBreak.integerBreak(20));
    }
}