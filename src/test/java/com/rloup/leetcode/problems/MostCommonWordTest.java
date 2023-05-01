package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {
    private final MostCommonWord mostCommonWord = new MostCommonWord();

    @Test
    void mostCommonWord() {
        String s = mostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                                                 new String[]{"hit"});
        String s2 = mostCommonWord.mostCommonWord("a.", new String[]{});
        String s3 = mostCommonWord.mostCommonWord("bob", new String[]{});

        assertEquals("ball", s);
        assertEquals("a", s2);
        assertEquals("bob", s3);
    }
}