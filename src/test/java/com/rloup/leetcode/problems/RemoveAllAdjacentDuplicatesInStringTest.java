package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInStringTest {

    private final RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString =
            new RemoveAllAdjacentDuplicatesInString();

    @Test
    void removeDuplicates() {
        String s = removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca");
        String s1 = removeAllAdjacentDuplicatesInString.removeDuplicates("azxxzy");
        String s2 = removeAllAdjacentDuplicatesInString.removeDuplicates("aaaaa");

        assertEquals("ca",s);
        assertEquals("ay",s1);
        assertEquals("a",s2);
    }
}