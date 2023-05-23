package com.rloup.leetcode.problems;

public class DeleteCharactersToMakeFancyString {
    public String makeFancyString(String s) {

        StringBuilder sb = new StringBuilder();
        char last = '_';
        int count = 0;

        for (char c : s.toCharArray()) {
            if (last == c) {
                count++;
            }else {
                last = c;
                count = 1;
            }
            if (count <= 2) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
