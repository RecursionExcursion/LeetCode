package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {

    public int numDifferentIntegers(String word) {

        Set<String> numsAsStrings = new HashSet<>();
        int start = -1;
        int end = -1;

        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= 48 && c <= 58) {
                if (start == -1) start = i;
                end = i;
            } else if (start != -1) {
                String ss = word.substring(start, end + 1);
                while (ss.startsWith("0")) ss = ss.substring(1);
                numsAsStrings.add(ss);
                start = -1;
                end = -1;

            }
        }
        if (start != -1) {
            String ss = word.substring(start, end + 1);
            while (ss.startsWith("0")) ss = ss.substring(1);
            numsAsStrings.add(ss);
        }
        return numsAsStrings.size();
    }

    public int numDifferentIntegersStream(String word) {
        return (int) Arrays.stream(word.split("\\D"))
                           .filter(s -> !s.isEmpty())
                           .map(s -> {
                               while (s.startsWith("0")) s = s.substring(1);
                               return s;
                           })
                           .distinct()
                           .count();
    }
}
