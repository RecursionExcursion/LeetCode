package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsYouCanTypeTest {

    private static final MaximumNumberOfWordsYouCanType maxWords = new MaximumNumberOfWordsYouCanType();

    @Test
    void canBeTypedWords() {
        int i1 = maxWords.canBeTypedWords("hello world", "ad");
        int i2 = maxWords.canBeTypedWords("leet code", "lt");
        int i3 = maxWords.canBeTypedWords("leet code", "e");
        int i4 = maxWords.canBeTypedWords("abc de", "");

        assertEquals(1, i1);
        assertEquals(1, i2);
        assertEquals(0, i3);
        assertEquals(2, i4);
    }
}