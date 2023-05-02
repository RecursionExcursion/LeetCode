package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {


    private final SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

    @Test
    void sortedSquares() {
        int[] ints = squaresOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        int[] ints1 = squaresOfASortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11});
        int[] ints2 = squaresOfASortedArray.sortedSquares(new int[]{-5, -3, -2, -1});

        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, ints);
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, ints1);
        assertArrayEquals(new int[]{1, 4, 9, 25}, ints2);

    }
}