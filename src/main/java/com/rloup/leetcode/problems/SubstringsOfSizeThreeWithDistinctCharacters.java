package com.rloup.leetcode.problems;

import java.util.stream.Stream;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        String s2 = "aababcabc";

        System.out.println(countGoodSubstrings(s));
        System.out.println(countGoodSubstrings(s2));
    }

    public static int countGoodSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {

            if (Stream.of(s.charAt(i), s.charAt(i + 1), s.charAt(i + 2)).distinct().count() == 3) ans++;
        }
        return ans;
    }

    public static int countGoodSubstrings1(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() - 2; i++) {
            if (chars[i] != chars[i + 1] &&
                    chars[i] != chars[i + 2] &&
                    chars[i + 1] != chars[i + 2]) ans++;
        }
        return ans;
    }
}
