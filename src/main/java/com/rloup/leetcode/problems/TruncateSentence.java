package com.rloup.leetcode.problems;

public class TruncateSentence {
    public static void main(String[] args) {
        String s1 = "Hello how are you Contestant";
        int k1 = 4;

        String s2 = "What is the solution to this problem";
        int k2 = 4;

        String s3 = "chopper is not a tanuki";
        int k3 = 5;

        System.out.println(truncateSentence(s1, k1));
        System.out.println(truncateSentence(s2, k2));
        System.out.println(truncateSentence(s3, k3));
    }

    public static String truncateSentence(String s, int k) {
        int i = 0;
        for (; i < s.length() && 0 < k; i++) if (s.charAt(i) == 32) k--;
        return k == 0 ? s.substring(0, i - 1) : s;
    }
}
