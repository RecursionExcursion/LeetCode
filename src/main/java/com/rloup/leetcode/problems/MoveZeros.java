package com.rloup.leetcode.problems;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
//        int[] arr = {0, 0, 1, 0, 3, 12};
//        int[] arr = {0, 0, 1};
        moveZeroes(arr);

    }

//    public static void moveZeroes(int[] nums) {
//
//        //initialize completed indexes starting from the rear to the last index
//        int confirmedZeroesAtRearIndex = nums.length - 1;
//
//        //iterate through array
//        for (int i = 0; i <= confirmedZeroesAtRearIndex; ) {
//            //check if value is 0 at each index
//            if (nums[i] == 0) {
//                //repeatedly move value to the right until at the rear
//                int j = i;
//                while (j < confirmedZeroesAtRearIndex) {
//                    int helper = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = helper;
//                    j++;
//                }
//                confirmedZeroesAtRearIndex--;
//            } else i++;
//        }
//    }

//    public static void moveZeroes(int[] nums) {
//
//        int confirmedZeroesAtRearIndex = nums.length - 1;
//        for (int i = 0; i < confirmedZeroesAtRearIndex; ) {
//            if (nums[i] == 0) {
//                int j = i;
//                while (j < confirmedZeroesAtRearIndex) {
//                    nums[j] = nums[++j];
//                }
//                nums[confirmedZeroesAtRearIndex--] = 0;
//            } else i++;
//        }
//    }

    public static void moveZeroes(int[] nums) {

        for (int i = 0, endBuffer = nums.length - 1; i < nums.length; i++, endBuffer--) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length && nums[j] == 0) j++;
                if (j >= nums.length) break;
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}