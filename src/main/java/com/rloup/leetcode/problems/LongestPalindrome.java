package com.rloup.leetcode.problems;

import java.util.PriorityQueue;
import java.util.Queue;

public class LongestPalindrome {

    public int longestPalindrome(String s) {

        int[] occurs = new int[52];

        for (char c : s.toCharArray()) {
            if (c >= 97) {
                occurs[c - 97 + 26]++;
            } else {
                occurs[c - 65]++;
            }
        }

        int longestPal = 0;

        Queue<Integer> q = new PriorityQueue<>((a, b) -> b - a);

        for (int i : occurs) {
            if (i != 0) {
                if (i % 2 == 0) longestPal += i;
                else q.add(i);
            }
        }

        while (q.size() > 1 && q.peek() != 1) {
            longestPal += q.poll() - 1;
        }

        return q.isEmpty() ? longestPal : longestPal + q.poll();
    }
}
