package com.rloup.leetcode.problems;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] ints = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 7 };
//		int[] ints = { 1, 2,2 };
		int k = removeDuplicates(ints);
		System.out.println(k);
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int k = nums.length - 1;
		for (int i = 0; i <= k; i++) {
			while (k != i && i + 1 != nums.length && nums[i] == nums[i + 1]) {
				for (int j = i + 1; j < k; j++) {
					int placeholder = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = placeholder;
				}
				k--;
			}
		}
		return k + 1;
	}

	public static int removeDuplicatesBetter(int[] nums) {
		int currentDups = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				currentDups++;

			}
			nums[i - currentDups] = nums[i];
		}
		return nums.length - currentDups;

	}
}
