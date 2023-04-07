package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class FindTheLongestBalancedSubstringOfABinaryString {
    public static void main(String[] args) {
        String s = "01000111";
        String s2 = "00111";
        String s3 = "111";

        System.out.println(findTheLongestBalancedSubstring(s));
        System.out.println(findTheLongestBalancedSubstring(s2));
        System.out.println(findTheLongestBalancedSubstring(s3));
    }

//    public static int findTheLongestBalancedSubstring(String s) {
//
//        int longestString = 0;
//
//        char[] charArray = s.toCharArray();
//
//        final int[] occurences = {0, 0};
//
//        Predicate<Character> charIsZero = c -> c == 48;
//
//        Consumer<Character> incIfTrue = c -> {
//            if (charIsZero.test(c)) occurences[0]++;
//            else occurences[1]++;
//        };
//
//        char last = charArray[0];
//        incIfTrue.accept(last);
//
//        for (int i = 1; i < charArray.length; i++) {
//            char c = charArray[i];
//
//            if (c != last) {
//                if (occurences[0] != 0 && occurences[1] != 0) {
//                    if (occurences[0] == occurences[1]) {
//                        longestString = Math.max(longestString,
//                                                 occurences[0] + occurences[1]);
//                        occurences[0] = 0;
//                        occurences[1] = 0;
//                    } else {
//                        if (charIsZero.test(c)) occurences[1] = 0;
//                        else occurences[0] = 0;
//                    }
//                }
//            }
//
//            incIfTrue.accept(c);
//
//            last = c;
//        }
//        if (occurences[0] == occurences[1]) {
//            longestString = Math.max(longestString,
//                                     occurences[0] + occurences[1]);
//        }
//        return longestString;
//    }

    public static int findTheLongestBalancedSubstring(String s) {

        int longestSubstring = 0;

        List<List<Character>> subStrings = new ArrayList<>();
        List<Character> chars = new ArrayList<>();

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            chars.add(c);
            if (i < charArray.length - 1) {
                if (c != charArray[i + 1]) {
                    subStrings.add(chars);
                    chars = new ArrayList<>();
                }
            }
        }
        subStrings.add(chars);

        for (int i = 0; i < subStrings.size() - 1; i++) {
            if (subStrings.get(i).get(0) == 48) {
                int zeroLength = subStrings.get(i).size();
                int oneLength = subStrings.get(i + 1).size();
                oneLength = Math.min(oneLength, zeroLength);
                zeroLength = oneLength;
                longestSubstring = Math.max(longestSubstring, zeroLength + oneLength);
            }
        }
        return longestSubstring;
    }
}
