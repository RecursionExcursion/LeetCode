package com.rloup.leetcode.problems;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder(s);
        char last = 0;
        for (int i = 0; i < sb.length() && sb.length() > 0; i++) {
            char c = sb.charAt(i);
            if (c == last) {
                sb.delete(i - 1, i + 1);
                i = Math.max(i - 3, -1);
                last = 0;
            } else {
                last = c;
            }
        }
        return sb.toString();
    }
}
