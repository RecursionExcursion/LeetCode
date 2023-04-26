package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDifferentIntegersInAStringTest {

    private final NumberOfDifferentIntegersInAString numberOfDifferentIntegersInAString =
            new NumberOfDifferentIntegersInAString();

    @Test
    void numDifferentIntegers() {
        int i = numberOfDifferentIntegersInAString.numDifferentIntegers("a123bc34d8ef34");
        int i1 = numberOfDifferentIntegersInAString.numDifferentIntegers("leet1234code234");
        int i2 = numberOfDifferentIntegersInAString.numDifferentIntegers("a1b01c001");

        assertEquals(3, i);
        assertEquals(2, i1);
        assertEquals(1, i2);
    }
}