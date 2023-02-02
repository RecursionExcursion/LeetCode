package com.rloup.leetcode.multi_file_problems.RangeSumQuery;

public class NumArray {

    private int[] arr;

    public NumArray(int[] nums) {
        arr = nums;
    }

    public int sumRange(int left, int right) {
        int sum = arr[left++];
        while (left <= right) sum += arr[left++];
        return sum;
    }


}
