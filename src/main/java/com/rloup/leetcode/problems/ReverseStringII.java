package com.rloup.leetcode.problems;

import java.util.function.Function;

public class ReverseStringII {
    public String reverseStr(String s, int k) {

        Function<String, String> revString = str -> {
            StringBuilder sb = new StringBuilder();
            char[] chars = str.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) sb.append(chars[i]);
            return sb.toString();
        };

        if (s.length() < 2) return revString.apply(s);

        int groupSize = 2 * k;
        groupSize = Math.min(groupSize, s.length());
        String ss = s.substring(0, groupSize);
        k = Math.min(s.length(), k);
        return revString.apply(ss.substring(0, k)) +
                ss.substring(k) + reverseStr(s.substring(groupSize), k);
    }
}
