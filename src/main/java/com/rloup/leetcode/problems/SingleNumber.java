package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(singleNumber2(nums));
    }

    public static int singleNumber(int[] nums) {

        List<Integer> listOfDups = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    listOfDups.add(nums[i]);
                }
            }
        }

        for (int n : nums) {
            if (!listOfDups.contains(n)) {
                return n;
            }
        }
        return -1;
    }

    public static int singleNumber2(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans = ans ^ i;
        }
        return ans;
    }
}
