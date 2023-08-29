package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.function.Function;

public class MaximumNumberOfWordsYouCanType {

    //    public int canBeTypedWords(String text, String brokenLetters) {
//
//        int ans = 0;
//
//        String[] brokenLettersArr = brokenLetters.isEmpty() ? new String[]{} : brokenLetters.split("");
//        String[] testArr = text.split(" ");
//
//        for (var s : testArr) {
//
//            boolean isValid = true;
//
//            for (var bs : brokenLettersArr) {
//                if (s.contains(bs)) {
//                    isValid = false;
//                    break;
//                }
//            }
//            if (isValid) ans++;
//        }
//
//        return ans;
//    }
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] brokenLettersArr = brokenLetters.isEmpty() ? new String[]{} : brokenLetters.split("");

        Function<String, Boolean> stringToBoolean = s -> Arrays.stream(brokenLettersArr)
                                                               .filter(s::contains)
                                                               .toList()
                                                               .isEmpty();

        return Arrays.stream(text.split(" "))
                     .map(stringToBoolean)
                     .filter(b -> b)
                     .toList()
                     .size();

    }
}
