package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelSubstringsOfAStringTest {


    private final CountVowelSubstringsOfAString countVowelSubstringsOfAString =
            new CountVowelSubstringsOfAString();

    @Test
    void countVowelSubstrings() {

        int i = countVowelSubstringsOfAString.countVowelSubstrings("aeiouu");
        int i1 = countVowelSubstringsOfAString.countVowelSubstrings("unicornarihan");
        int i2 = countVowelSubstringsOfAString.countVowelSubstrings("cuaieuouac");

        assertEquals(2, i);
        assertEquals(0, i1);
        assertEquals(7, i2);

    }
}