package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerReplacementTest {

    @Test
    void integerReplacement() {
        IntegerReplacement integerReplacement = new IntegerReplacement();

        assertEquals(3, integerReplacement.integerReplacement(8));
        assertEquals(4, integerReplacement.integerReplacement(7));
        assertEquals(2, integerReplacement.integerReplacement(4));
        assertEquals(32, integerReplacement.integerReplacement(2147483647));
    }
}