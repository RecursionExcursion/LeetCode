package com.rloup.leetcode.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
    public static void main(String[] args) {


        System.out.println(generateParenthesis(1));
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(4));

    }

    private static List<String> generateParenthesis(int n) {

        Set<String> parenSet = new HashSet<>();
        String parenOpen = "(";
        String parenClose = ")";
        String pair = parenOpen + parenClose;


        genPren(parenSet,
                new HashSet<>(),
                pair,
                pair,
                n);

        return parenSet.stream().toList();
    }

    private static Set<String> genPren(Set<String> stringSet,
                                       Set<String> used,
                                       String s,
                                       String pair,
                                       int n) {
        if (s.length() == n * 2) {
            stringSet.add(s);
            return stringSet;
        }
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            String temp = String.valueOf(sb.insert(i, pair));

            int ssSize = stringSet.size();

            if (!used.contains(temp)) {
                stringSet.addAll(genPren(stringSet, used, temp, pair, n));
            }

            if (ssSize < stringSet.size()) {
                used.add(temp);
            }
        }
        return new HashSet<>();
    }
}
