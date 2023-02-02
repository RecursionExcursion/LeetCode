package com.rloup.leetcode.problems;

import java.util.*;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] n = {1, 3, 2};
        int[] n2 = {1, 2};
        int[] n3 = {1, 2, 2, 3, 3};
        int[] n4 = {1, 2, 2, 3, 3, 4, 4, 5, 6};

        System.out.println(thirdMax(n));
        System.out.println(thirdMax(n2));
        System.out.println(thirdMax(n3));
        System.out.println(thirdMax(n4));

    }

    public static int thirdMax(int[] nums) {

        List<Integer> list = Arrays.stream(nums).
                                   distinct().
                                   sorted().
                                   boxed().
                                   toList();

        return list.size() >= 3 ? list.get(list.size() - 3) : list.get(list.size() - 1);
    }
}
