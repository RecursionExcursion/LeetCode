package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    private final DecodeString stringDecoder = new DecodeString();

    @Test
    void decodeString() {
        assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", stringDecoder.decodeString("10[leetcode]"));

        assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef", stringDecoder.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
        assertEquals("aaabcbc", stringDecoder.decodeString("3[a]2[bc]"));

        assertEquals("abcabccdcdcdef", stringDecoder.decodeString("2[abc]3[cd]ef"));

        assertEquals("accaccacc", stringDecoder.decodeString("3[a2[c]]"));



    }
}