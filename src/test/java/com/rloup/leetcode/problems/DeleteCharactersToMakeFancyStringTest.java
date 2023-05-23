package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteCharactersToMakeFancyStringTest {

    private final DeleteCharactersToMakeFancyString deleteCharactersToMakeFancyString =
            new DeleteCharactersToMakeFancyString();

    @Test
    void makeFancyString() {
        String s3 = deleteCharactersToMakeFancyString.makeFancyString("abbcccddddeeeee");

        String s = deleteCharactersToMakeFancyString.makeFancyString("leeetcode");
        String s1 = deleteCharactersToMakeFancyString.makeFancyString("aaabaaaa");
        String s2 = deleteCharactersToMakeFancyString.makeFancyString("aab");

        assertEquals("leetcode", s);
        assertEquals("aabaa", s1);
        assertEquals("aab", s2);
        assertEquals("abbccddee", s3);
    }
}