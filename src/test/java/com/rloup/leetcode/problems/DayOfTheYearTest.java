package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheYearTest {

    private final DayOfTheYear dayOfTheYear = new DayOfTheYear();

    @Test
    void dayOfYear() {
        assertEquals(9, dayOfTheYear.dayOfYear("2019-01-09"));
        assertEquals(41, dayOfTheYear.dayOfYear("2019-02-10"));
        assertEquals(61, dayOfTheYear.dayOfYear("2004-03-01"));
    }
}