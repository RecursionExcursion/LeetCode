package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.List;

public class ValidPalindrome {
    public static void main(String[] args) {
        String phrase = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(phrase));
    }

    public static boolean isPalindrome(String s) {

        List<String> lettersOnly = Arrays.stream(s.split(""))
                                         .filter(letter -> letter.matches("(?i)[a-z0-9]"))
                                         .toList();

        for (int i = 0; i < lettersOnly.size(); i++) {
            if (!lettersOnly.get(i).equalsIgnoreCase(
                    lettersOnly.get(lettersOnly.size() - 1 - i))){
                return false;
            }
        }
        return true;
    }
}
