package com.rloup.leetcode.problems;

public class NumberOfEvenAndOddBits {
    public int[] evenOddBit(int n) {

        // Reverse it because in numbers we count
        // indexes from right to left but in string we
        // count indexes from left to right.

        String binary = Integer.toBinaryString(n);
        int[] bitOccurrences = new int[2];
        int l = binary.length();
        for (int i = 0; i < l; i++) {
            if (binary.charAt(l - (i + 1)) == 49) bitOccurrences[i % 2]++;
        }
        return bitOccurrences;
    }
}
