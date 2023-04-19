package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BullsAndCowsTest {

    private final BullsAndCows bullsAndCows = new BullsAndCows();

    @Test
    void getHint() {
        assertEquals("1A3B", bullsAndCows.getHint("1807", "7810"));
        assertEquals("1A1B", bullsAndCows.getHint("1123", "0111"));
        assertEquals("1A0B", bullsAndCows.getHint("11", "10"));
        assertEquals("0A0B", bullsAndCows.getHint("1122", "3456"));
    }
}