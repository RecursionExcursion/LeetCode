package com.rloup.leetcode.problems;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences)
                     .map(sent -> sent.split(" ").length)
                     .reduce(Integer::max)
                     .orElse(-1);
    }
}
