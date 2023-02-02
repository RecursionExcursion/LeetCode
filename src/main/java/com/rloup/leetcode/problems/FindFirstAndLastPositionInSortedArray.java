package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirstAndLastPositionInSortedArray {

    public static void main(String[] args) {

        int[] ints = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(ints, 8)));
        System.out.println(Arrays.toString(searchRange(ints, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));
        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1}, 1)));
    }

    public static int[] searchRange(int[] nums, int target) {

        return IntStream.range(0, nums.length)
                                  .filter(i -> nums[i] == target)
                                  .boxed()
                                  .collect(Collectors.teeing(Collectors.minBy(Integer::compareTo),
                                                             Collectors.maxBy(Integer::compareTo),
                                                             (min, max) ->
                                                                     new int[]{min.orElse(-1), max.orElse(-1)}
                                  ));
    }

//    public static int[] searchRange(int[] nums, int target) {
//
//        int firstIndex = -1;
//        int lastIndex = -1;
//
//        for (int first = 0, last = nums.length - 1;
//             first <= last && (firstIndex == -1 || lastIndex == -1); ) {
//
//            if (firstIndex == -1) {
//                if (nums[first] == target) {
//                    firstIndex = first;
//                } else {
//                    first++;
//                }
//            }
//
//            if (lastIndex == -1) {
//                if (nums[last] == target) {
//                    lastIndex = last;
//                } else {
//                    last--;
//                }
//            }
//        }
//        return new int[]{firstIndex, lastIndex};
//    }
}
