package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base7Test {

    private final Base7 base7 = new Base7();

    @Test
    void convertToBase7() {
        assertEquals("202",base7.convertToBase7(100));
        assertEquals("-10",base7.convertToBase7(-7));
        assertEquals("164",base7.convertToBase7(95));
    }
}