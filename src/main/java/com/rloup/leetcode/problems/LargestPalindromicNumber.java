package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class LargestPalindromicNumber {
    public String largestPalindromic(String num) {

        int[] intOccurs = new int[10];
        for (char c : num.toCharArray()) {
            intOccurs[c - 48]++;
        }

        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < intOccurs.length; i++) {
            if (intOccurs[i] != 0) indexes.add(i);
        }
        indexes.sort((a, b) -> b - a);

        StringBuilder sb = new StringBuilder();
        int soloIndex = -1;

        for (int i : indexes) {

            int val = intOccurs[i];
            char key = (char) (i + 48);

            if (val > 1 && !(key == '0' && sb.isEmpty())) {
                sb.append(String.valueOf(key).repeat(val / 2));
                if (val % 2 != 0) {
                    soloIndex = Math.max(soloIndex, key);
                }
            } else {
                soloIndex = Math.max(soloIndex, key);
            }
        }

        StringBuilder revSb = new StringBuilder(sb).reverse();
        if (soloIndex >= 0) {
            sb.append((char) soloIndex).append(revSb);
        } else {
            sb.append(revSb);
        }

        return sb.toString();
    }
}
