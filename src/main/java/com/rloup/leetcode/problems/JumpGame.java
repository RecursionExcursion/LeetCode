package com.rloup.leetcode.problems;

public class JumpGame {
    public static void main(String[] args) {

        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(canJump(new int[]{2, 0}));
        System.out.println(canJump(new int[]{2, 5, 0, 0}));
        System.out.println(canJump(new int[]{100, 0}));
        System.out.println(canJump(new int[]{2, 0}));
        System.out.println(canJump(new int[]{9, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0}));
        System.out.println(canJump(new int[]{0}));

    }

    private static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int reachThisToWin = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) if (nums[i] + i >= reachThisToWin) reachThisToWin = i;
        return reachThisToWin == 0;
    }
}
