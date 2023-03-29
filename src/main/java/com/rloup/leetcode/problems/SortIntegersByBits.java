package com.rloup.leetcode.problems;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class SortIntegersByBits {

    public static void main(String[] args) {
        int[] input = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] input2 = new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

        Consumer<int[]> printArr = arr -> {
            arr = sortByBits(arr);
            for (int i : arr) System.out.print(i + ", ");
            System.out.println();
        };

        printArr.accept(input);
        printArr.accept(input2);
    }

    public static int[] sortByBits(int[] arr) {

        BiFunction<Integer, Integer, Integer> compareIntsAsBinaries = (i1, i2) -> {

            Function<String, Integer> getNumOfOnes = s -> {
                int n = 0;
                for (int i = 0; i < s.length(); i++) if (s.charAt(i) == 48 + 1) n++;
                return n;
            };

            int diff = getNumOfOnes.apply(Integer.toBinaryString(i1)) - getNumOfOnes.apply(Integer.toBinaryString(i2));

            return diff != 0 ? diff : i1 - i2;
        };

        List<Integer> intList = new ArrayList<>();
        for (int i : arr) intList.add(i);
        intList.sort(compareIntsAsBinaries::apply);
        for (int j = 0; j < arr.length; j++) arr[j] = intList.get(j);
        return arr;
    }

    public static int[] sortByBitsOriginal(int[] arr) {

        BiFunction<Integer, Integer, Integer> compareIntsAsBinaries = (i1, i2) -> {

            Function<String, Integer> getNumOfOnes = s -> {
                int n = 0;
                for (int i = 0; i < s.length(); i++) if (s.charAt(i) == 48 + 1) n++;
                return n;
            };

            int diff = getNumOfOnes.apply(Integer.toBinaryString(i1)) - getNumOfOnes.apply(Integer.toBinaryString(i2));

            return diff != 0 ? diff : i1 - i2;
        };

        return Arrays.stream(arr)
                     .boxed()
                     .sorted(compareIntsAsBinaries::apply)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
