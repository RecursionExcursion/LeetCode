package com.rloup.leetcode.problems;

public class Sqrt {

	public static void main(String[] args) {
		int x = 2;
		System.out.println(mySqrt(x));
	}

	public static int mySqrt(int x) {

		int subNum = 1;
		int count = 0;

		while (x > 0) {
			x -= subNum;
			subNum += 2;
			count++;
		}
		if (x < 0) {
			return count - 1;
		} else {

			return count;
		}
	}
}
 