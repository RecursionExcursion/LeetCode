package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    private NumberOfIslands classObj = new NumberOfIslands();

    private char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };

    private char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
    };


    @Test
    void numIslandsTest() {
        assertEquals(1, classObj.numIslands(grid));
        assertEquals(3, classObj.numIslands(grid2));
    }
}