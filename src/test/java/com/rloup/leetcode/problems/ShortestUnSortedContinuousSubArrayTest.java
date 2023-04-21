package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestUnSortedContinuousSubArrayTest {


    private final ShortestUnSortedContinuousSubArray shortestUnSortedContinuousSubArray =
            new ShortestUnSortedContinuousSubArray();

    @Test
    void findUnsortedSubarray() {
        int[] arg1 = new int[]{2, 6, 4, 8, 10, 9, 15};
        int[] arg2 = new int[]{1, 2, 3, 4};
        int[] arg3 = new int[]{1};
        assertEquals(4, shortestUnSortedContinuousSubArray.findUnsortedSubarray(new int[]{1, 3, 2, 2, 2}));
        assertEquals(2, shortestUnSortedContinuousSubArray.findUnsortedSubarray(new int[]{2, 1}));
        assertEquals(5, shortestUnSortedContinuousSubArray.findUnsortedSubarray(arg1));
        assertEquals(0, shortestUnSortedContinuousSubArray.findUnsortedSubarray(arg2));
        assertEquals(0, shortestUnSortedContinuousSubArray.findUnsortedSubarray(arg3));
    }
}