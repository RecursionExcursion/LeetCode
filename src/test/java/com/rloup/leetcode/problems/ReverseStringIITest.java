package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringIITest {

    private final ReverseStringII reverseStringII = new ReverseStringII();
    @Test
    void reverseStr() {


        assertEquals("bacdfeg",reverseStringII.reverseStr("abcdefg", 2));
        assertEquals("bacd",reverseStringII.reverseStr("abcd", 2));
    }
}