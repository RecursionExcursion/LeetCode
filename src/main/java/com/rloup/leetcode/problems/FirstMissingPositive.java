package com.rloup.leetcode.problems;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {

        int[] nums = {1, 2, 0};
        int[] nums2 = {3, 4, -1, 1};
        int[] nums3 = {7, 8, 9, 11, 12};


        System.out.println(firstMissingPositive(nums));
        System.out.println(firstMissingPositive(nums2));
        System.out.println(firstMissingPositive(nums3));

    }

    public static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int current = 0;
        for (int i : nums) {
            if (i > current) {
                if (current + 1 < i) {
                    return ++current;
                } else {
                    ++current;
                }
            }
        }
        return ++current;
    }
}
