package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfEvenAndOddBitsTest {

    @Test
    void evenOddBit() {
        NumberOfEvenAndOddBits obj = new NumberOfEvenAndOddBits();
        assertArrayEquals(new int[]{2, 0}, obj.evenOddBit(17));
        assertArrayEquals(new int[]{0, 1}, obj.evenOddBit(2));

    }
}