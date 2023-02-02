package com.rloup.leetcode.problems;

import java.math.BigInteger;

public class PlusOne {
	public static void main(String[] args) {

	}

	public static int[] plusOne(int[] digits) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i : digits) {
			stringBuilder.append(String.valueOf(i));
		}
		BigInteger bigValue = new BigInteger(stringBuilder.toString())
				.add(BigInteger.valueOf(1));
		String[] valueStrings = bigValue.toString().split("");
		int[] ans = new int[valueStrings.length];
		for (int i = 0; i < valueStrings.length; i++) {
			ans[i] = Integer.valueOf(valueStrings[i]);
		}
		return ans;
	}

	public int[] plusOneBetter(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				++digits[i];
				return digits;
			}
			digits[i] = 0;
		}
		int[] ans = new int[digits.length + 1];
		ans[0] = 1;
		return ans;
	}
}
