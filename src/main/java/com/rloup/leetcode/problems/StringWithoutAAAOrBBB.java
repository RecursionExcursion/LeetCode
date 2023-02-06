package com.rloup.leetcode.problems;

import java.util.ArrayDeque;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringWithoutAAAOrBBB {
    public static void main(String[] args) {
        System.out.println(strWithout3a3b(1, 2));
        System.out.println(strWithout3a3b(4, 1));
        System.out.println(strWithout3a3b(4, 4));
        System.out.println(strWithout3a3b(6, 2));
        System.out.println(strWithout3a3b(10, 10));
        System.out.println(strWithout3a3b(5, 6));
        System.out.println(strWithout3a3b(6, 5));
    }

    public static String strWithout3a3b(int a, int b) {

        BiFunction<String, Integer, ArrayDeque<String>> getDequeOfString = (s, i) ->
                IntStream.range(0, i)
                         .mapToObj(n -> s)
                         .collect(Collectors.toCollection(ArrayDeque::new));

        Function<ArrayDeque<String>, String> popIfNotEmpty = dq -> !dq.isEmpty() ? dq.pop() : "";

        ArrayDeque<String> aQueue = getDequeOfString.apply("a", a);
        ArrayDeque<String> bQueue = getDequeOfString.apply("b", b);
        StringBuilder sb = new StringBuilder();

        while (!aQueue.isEmpty() || !bQueue.isEmpty()) {
            int aqSize = aQueue.size();
            int bqSize = bQueue.size();

            if (Math.abs(aqSize - bqSize) <= 1) {
                sb.append(popIfNotEmpty.apply(aQueue));
                sb.append(popIfNotEmpty.apply(bQueue));
            } else if (aqSize > bqSize) {
                sb.append(popIfNotEmpty.apply(aQueue));
                sb.append(popIfNotEmpty.apply(aQueue));
                sb.append(popIfNotEmpty.apply(bQueue));
            } else {
                sb.append(popIfNotEmpty.apply(bQueue));
                sb.append(popIfNotEmpty.apply(bQueue));
                sb.append(popIfNotEmpty.apply(aQueue));
            }
        }
        return sb.toString();
    }
}
