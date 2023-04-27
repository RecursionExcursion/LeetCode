package com.rloup.leetcode.problems;

import java.util.Stack;

public class DecryptStringFromAlphabetToIntegerMapping {

    public String freqAlphabets(String s) {

        Stack<Integer> list = new Stack<>();

        char[] charArr = s.toCharArray();
        for (int i = charArr.length - 1; i >= 0;) {
            if (charArr[i] == '#') {
                list.push(Integer.parseInt(s.substring(i - 2, i)));
                i -= 3;
            } else {
                list.push(Character.getNumericValue(charArr[i--]));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!list.empty()) {
            sb.append((char) (97 + (list.pop() - 1)));
        }

        return sb.toString();
    }
}
