package com.rloup.leetcode.problems;

public class FirstBadVersion {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(firstBadVersion(i));

    }

    private static boolean isBadVersion(int v) {
        int badVersion = 1;
        return v >= badVersion;
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        while (start < n) {
            int mid = ((n - start) / 2) + start;
            if (isBadVersion(mid)) n = mid;
            else start = mid + 1;
        }
        return start;
    }
}
