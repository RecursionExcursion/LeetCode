package com.rloup.leetcode.problems;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] i = {1, 2, 3};
        int[] i2 = {3, 2, 1};
        int[] i3 = {1, 3, 2, 4};
        int[] i4 = {1, 2};
        int[] i5 = {2, 3, 1};
        int[] i6 = {5, 4, 7, 5, 3, 2};
        int[] i7 = {1, 5, 1};
        int[] i8 = {2, 2, 7, 5, 4, 3, 2, 2, 1};

        nextPermutation(i8);
        nextPermutation(i7);
        nextPermutation(i3);
        nextPermutation(i6);

        nextPermutation(i);
        nextPermutation(i2);
        nextPermutation(i4);
        nextPermutation(i5);

        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(i2));
        System.out.println(Arrays.toString(i3));
        System.out.println(Arrays.toString(i4));
        System.out.println(Arrays.toString(i5));
        System.out.println(Arrays.toString(i6));
        System.out.println(Arrays.toString(i7));
        System.out.println(Arrays.toString(i8));

    }

    public static void nextPermutation(int[] nums) {

        //Get Pivot
        int i = nums.length - 1;
        while (i > 1 && nums[i] <= nums[i - 1]) {
            i--;
        }

        i = Math.max(i - 1, 0);

        //Swap pivot with next largest following number
        int nextSmallest = Integer.MAX_VALUE;
        int nextSmallestIndex = -1;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] > nums[i]) {
                nextSmallest = Math.min(nums[j], nextSmallest);
                nextSmallestIndex = j;
            }
        }
        //Return sorted array if pivot is < 1, reverse suffix after pivot, otherwise.
        if (nextSmallestIndex < 0) {
            Arrays.sort(nums);
        } else {
            int help = nums[i];
            nums[i] = nums[nextSmallestIndex];
            nums[nextSmallestIndex] = help;
            if (++i != nums.length - 1) {
                for (int z = 0; z < (nums.length - i) / 2; z++) {
                    int helper = nums[i + z];
                    nums[i + z] = nums[nums.length - 1 - z];
                    nums[nums.length - 1 - z] = helper;
                }
            }
        }
    }
}
