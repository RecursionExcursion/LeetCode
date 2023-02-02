package com.rloup.leetcode.problems;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(reverseOnlyLetters("7_28]"));

    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0, j = chars.length - 1; i < j; ++i, --j) {

            while (!Character.isLetter(chars[i]) && i < j) ++i;

            while (!Character.isLetter(chars[j]) && i < j) --j;

            if (i < j) {
                char tempChar = chars[i];
                chars[i] = chars[j];
                chars[j] = tempChar;
            }
        }
        return new String(chars);
    }
}
