package com.rloup.leetcode.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SmallestRangeI {
    public int smallestRangeIOG(int[] nums, int k) {


        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;

        for (int curr : nums) {
            high = Math.max(high, curr);
            low = Math.min(low, curr);
        }
        int minDiff = Math.abs(high - low);
        return minDiff < k * 2 ? 0 : minDiff - k * 2;
    }

    public int smallestRangeI(int[] nums, int k) {
        Supplier<Stream<Integer>> getStream = () -> Arrays.stream(nums).boxed();
        int minDiff = Math.abs(getStream.get().max(Comparator.naturalOrder()).orElseThrow() -
                                       getStream.get().min(Comparator.naturalOrder()).orElseThrow());
        return minDiff < k * 2 ? 0 : minDiff - k * 2;
    }
}
