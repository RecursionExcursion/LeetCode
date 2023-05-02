package com.rloup.leetcode.problems;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        return Arrays.stream(nums)
                     .mapToObj(i -> (int) Math.pow(i, 2))
                     .sorted()
                     .mapToInt(i -> i)
                     .toArray();
    }
}
