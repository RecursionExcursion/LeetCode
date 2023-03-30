package com.rloup.leetcode.problems;

import java.util.function.Predicate;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String[] words = new String[]{"abc", "car", "ada", "racecar", "cool"};
        String[] words2 = new String[]{"notapalindrome", "racecar"};
        String[] words3 = new String[]{"def", "ghi"};

        System.out.println(firstPalindrome(words));
        System.out.println(firstPalindrome(words2));
        System.out.println(firstPalindrome(words3));

    }

    public static String firstPalindrome(String[] words) {
        Predicate<String> isPalindrome = s -> {
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) return false;
            }
            return true;
        };

        for (String word : words) {
            if (isPalindrome.test(word)) return word;
        }
        return "";
    }
}
