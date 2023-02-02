package com.rloup.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> usedNums = new HashSet<>();

        for (int n : nums) {
            if (!usedNums.add(n)) {
                return true;
            }
        }
        return false;
    }
}
