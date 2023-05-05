package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPalindromicNumberTest {

    private final LargestPalindromicNumber largestPalindromicNumber = new LargestPalindromicNumber();
    @Test
    void largestPalindromic() {
        String s = largestPalindromicNumber.largestPalindromic("444947137");
        String s1 = largestPalindromicNumber.largestPalindromic("00009");
        String s2 = largestPalindromicNumber.largestPalindromic("5555005229");

        assertEquals("7449447",s);
        assertEquals("9",s1);


    }
}