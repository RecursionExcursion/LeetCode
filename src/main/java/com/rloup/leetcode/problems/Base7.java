package com.rloup.leetcode.problems;

public class Base7 {

    public String convertToBase7(int num) {

        int i = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        do {
            sb.append(i % 7);
            i /= 7;
        } while (i != 0);

        if (num < 0) sb.append("-");
        return sb.reverse().toString();
    }
}
