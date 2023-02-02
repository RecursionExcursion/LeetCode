package com.rloup.leetcode.problems;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] n = {-1, 0, 1, 2, -1, -4};
        int[] n2 = {0, 0, 0};
        int[] n3 = {0, 0, 1};


        for (List<Integer> li : threeSum(n)) System.out.println(li);
        threeSum(n2).forEach(System.out::println);
        threeSum(n3).forEach(System.out::println);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listSet = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0, j = 1, k = nums.length - 1; i < nums.length - 2; ) {

            int x = nums[i] + nums[j] + nums[k];

            if (x == 0) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(nums[i]);
                tempList.add(nums[j]);
                tempList.add(nums[k]);
                tempList.sort(Integer::compareTo);
                listSet.add(tempList);
            }
            if (x <= 0) j++;
            else k--;
            if (j >= k) {
                i++;
                j = i + 1;
                k = nums.length - 1;
            }
        }
        return new ArrayList<>(listSet);
    }
}
