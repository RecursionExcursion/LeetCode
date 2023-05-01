package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestRangeITest {
    private final SmallestRangeI smallestRangeI = new SmallestRangeI();

    @Test
    void smallestRangeI() {
        int i1 = smallestRangeI.smallestRangeI(new int[]{0, 10}, 2);
        int i = smallestRangeI.smallestRangeI(new int[]{1}, 0);
        int i2 = smallestRangeI.smallestRangeI(new int[]{1, 3, 6}, 3);
        int i3 = smallestRangeI.smallestRangeI(new int[]{2, 7, 2}, 1);

        assertEquals(0, i);
        assertEquals(6, i1);
        assertEquals(0, i2);
        assertEquals(3, i3);
    }
}