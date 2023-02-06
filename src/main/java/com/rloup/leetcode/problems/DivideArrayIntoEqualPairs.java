package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {

    }

    private static boolean DivideArray(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (Integer i : nums) {
            if (result.contains(i)) result.remove(i);
            else result.add(i);
        }
        return result.size() == 0;
    }
}
