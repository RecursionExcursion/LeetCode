package com.rloup.leetcode.problems;

public class GreatestEnglishLetterInUpperAndLowerCase {
    public static void main(String[] args) {
        String s1 = "lEeTcOdE";
        String s2 = "arRAzFif";
        String s3 = "AbCdEfGhIjK";

        System.out.println(greatestLetter(s1));
        System.out.println(greatestLetter(s2));
        System.out.println(greatestLetter(s3));
    }

    public static String greatestLetter(String s) {

        boolean[][] b = new boolean[26][2];
        char[] chars = s.toCharArray();
        int ansIndex = -1;

        for (char c : chars) {
            if (c >= 65 && c <= 90 ||
                    c >= 97 && c <= 122) {

                boolean isUpperCase = c <= 90;
                int x = isUpperCase ? c - 65 : c - 97;
                int y = isUpperCase ? 0 : 1;
                b[x][y] = true;

                if (b[x][0] && b[x][1]) {
                    ansIndex = Math.max(ansIndex, x);
                }
            }
        }
        return ansIndex == -1 ? "" : Character.toString((char) ansIndex + 65);
    }
}
