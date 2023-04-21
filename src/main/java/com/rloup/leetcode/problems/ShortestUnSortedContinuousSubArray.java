package com.rloup.leetcode.problems;

import java.util.Arrays;

public class ShortestUnSortedContinuousSubArray {

    public int findUnsortedSubarray(int[] nums) {

        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int frontSort = 0;
        boolean frontSorted = false;
        int backSort = 0;
        boolean backSorted = false;
        for (int i = 0; i < nums.length; i++) {
            if (backSorted && frontSorted) break;
            if (!frontSorted && nums[i] == sortedNums[i]) frontSort++;
            else frontSorted = true;
            if (!backSorted && nums[nums.length - i - 1] == sortedNums[nums.length - i - 1]) backSort++;
            else backSorted = true;
        }
        int ans = nums.length - frontSort - backSort;
        return Math.max(ans, 0);
    }
}
