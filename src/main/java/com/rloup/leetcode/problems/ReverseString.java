package com.rloup.leetcode.problems;

public class ReverseString {
    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        reverseString(c);
        System.out.println(c);
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int i = s.length - 1, j = 0; i > (s.length - 1) / 2; i--, j++) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }
}
