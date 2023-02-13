package com.rloup.leetcode.problems;

import java.util.Arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            boolean numberFound = false;

            for (int j : nums2) {

                if (numberFound && j > n) {
                    arr[i] = j;
                    numberFound = false;
                    break;
                }

                if (j == n) {
                    numberFound = true;
                }
            }

            if (numberFound) {
                arr[i] = -1;
            }
        }
        return arr;
    }
}
