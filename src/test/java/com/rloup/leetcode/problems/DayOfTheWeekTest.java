package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    private final DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();

    @Test
    void dayOfTheWeek() {
        String s1 = dayOfTheWeek.dayOfTheWeek(31,8,2019);
        String s2 = dayOfTheWeek.dayOfTheWeek(18,7,1999);
        String s3= dayOfTheWeek.dayOfTheWeek(15,8,1993);

        assertEquals(s1,"Saturday");
        assertEquals(s2,"Sunday");
        assertEquals(s3,"Sunday");
    }
}