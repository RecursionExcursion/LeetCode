package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptStringFromAlphabetToIntegerMappingTest {


    private final DecryptStringFromAlphabetToIntegerMapping decryptStringFromAlphabetToIntegerMapping =
            new DecryptStringFromAlphabetToIntegerMapping();

    @Test
    void freqAlphabets() {
        String s = decryptStringFromAlphabetToIntegerMapping.freqAlphabets("10#11#12");
        String s1 = decryptStringFromAlphabetToIntegerMapping.freqAlphabets("1326#");
        String s2 = decryptStringFromAlphabetToIntegerMapping.freqAlphabets("1326");

        assertEquals("jkab",s);
        assertEquals("acz",s1);
        assertEquals("acbf",s2);
    }
}