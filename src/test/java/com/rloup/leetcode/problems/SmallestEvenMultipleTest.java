package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestEvenMultipleTest {

    @Test
    void smallestEvenMultiple() {
        SmallestEvenMultiple obj = new SmallestEvenMultiple();
        assertEquals(10,obj.smallestEvenMultiple(5));
        assertEquals(6,obj.smallestEvenMultiple(6));
        assertEquals(4,obj.smallestEvenMultiple(4));
    }
}