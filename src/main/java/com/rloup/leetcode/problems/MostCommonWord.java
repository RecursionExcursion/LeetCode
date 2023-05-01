package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {

        return Arrays.stream(paragraph.toLowerCase().split("\\W"))
                     .filter(s -> {
                         if(s.isEmpty()) return false;
                         for (String b : banned) if (b.equals(s)) return false;
                         return true;
                     })
                     .collect(Collectors.toMap(k -> k, v -> 1, (oV, nV) -> ++oV))
                     .entrySet()
                     .stream()
                     .sorted((a, b) -> b.getValue() - a.getValue())
                     .map(Map.Entry::getKey)
                     .findFirst().orElseThrow();
    }
}
