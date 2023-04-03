package com.rloup.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckWhetherTwoStringsAreAlmostEquivalent {

    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("aaaa", "bccb"));
        System.out.println(checkAlmostEquivalent("abcdeef", "abaaacc"));
        System.out.println(checkAlmostEquivalent("cccddabba", "babababab"));
        System.out.println();
        System.out.println(checkAlmostEquivalentStream("aaaa", "bccb"));
        System.out.println(checkAlmostEquivalentStream("abcdeef", "abaaacc"));
        System.out.println(checkAlmostEquivalentStream("cccddabba", "babababab"));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {

        Map<Character, Integer> charOccurrence = new HashMap<>();

        for (char c : word1.toCharArray()) {
            if (charOccurrence.containsKey(c)) {
                charOccurrence.put(c, charOccurrence.get(c) + 1);
            } else {
                charOccurrence.put(c, 1);
            }
        }

        for (char c : word2.toCharArray()) {
            if (charOccurrence.containsKey(c)) {
                charOccurrence.put(c, charOccurrence.get(c) - 1);
            } else {
                charOccurrence.put(c, -1);
            }
        }

        for (int v : charOccurrence.values()) {
            if (v > 3 || v < -3) return false;
        }

        return true;
    }

    public static boolean checkAlmostEquivalentStream(String word1, String word2) {

        HashMap<Character, Integer> collect = IntStream.range(0, word1.length())
                                                       .mapToObj(word1::charAt)
                                                       .collect(Collectors.toMap(
                                                               c -> c, c -> 1,
                                                               (oldVal, newVal) -> oldVal + 1,
                                                               HashMap::new)
                                                       );
        IntStream.range(0, word2.length())
                 .mapToObj(word2::charAt)
                 .forEach(c -> {
                     if (collect.containsKey(c)) {
                         collect.put(c, collect.get(c) - 1);
                     } else {
                         collect.put(c, -1);
                     }
                 });

        return collect.values()
                      .stream()
                      .map(v -> v <= 3 && v >= -3)
                      .filter(b -> !b)
                      .findAny()
                      .orElse(true);

    }
}