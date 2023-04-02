package com.rloup.leetcode.problems;

public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        String s = "ababa";
        String s2 = "abb";
        String s3 = "baabb";
        String s4 = "ababbbaaba";
        String s5 = "ababb";

        System.out.println(removePalindromeSub(s));
        System.out.println(removePalindromeSub(s2));
        System.out.println(removePalindromeSub(s3));
        System.out.println(removePalindromeSub(s4));
        System.out.println(removePalindromeSub(s5));

    }

    public static int removePalindromeSub(String s) {

        if (isPalindrome(s)) return 1;

        int subSequences = s.length();

        int x = 1, y = 1;
        while (x < subSequences) {
            int depth = 1;

            for (int i = 0; i < s.length() - x; i += y) {
                String newWord = s;
                newWord = removeCharsAt(newWord, i, x);
                if (isPalindrome(newWord)) {
                    depth++;
                    subSequences = Math.min(subSequences, depth);
                }
            }
            x++;
            y++;
        }
        return subSequences;
    }

    private static String removeCharsAt(String word, int charIndex, int amount) {
        String start = word.substring(0, charIndex);
        String end = word.substring(charIndex + amount);
        return start + end;
    }

    private static boolean isPalindrome(String word) {
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) return false;
        }
        return true;
    }
}
