package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalSquareTest {

    private final MaximalSquare maximalSquare = new MaximalSquare();

    @Test
    void maximalSquare() {

        char[][] arg = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};

        char[][] arg2 = new char[][]{
                {'0', '1'},
                {'1', '0'}};

        char[][] arg3 = new char[][]{{'0',}};

        char[][] arg4 = new char[][]{
                {'0', '0', '1', '0'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '0'},
                {'1', '1', '0', '0'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '0'}};


        assertEquals(4, maximalSquare.maximalSquare(arg));
        assertEquals(1, maximalSquare.maximalSquare(arg2));
        assertEquals(0, maximalSquare.maximalSquare(arg3));
        assertEquals(9, maximalSquare.maximalSquare(arg4));
    }
}