package com.rloup.leetcode.problems;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class BestPokerHand {
    public static void main(String[] args) {

        BiConsumer<int[], char[]> computeAndPrint = (i, c) -> System.out.println(bestHand(i, c));

        computeAndPrint.accept(new int[]{13, 2, 3, 1, 9}, new char[]{'a', 'a', 'a', 'a', 'a'});
        computeAndPrint.accept(new int[]{4, 4, 2, 4, 4}, new char[]{'d', 'a', 'a', 'b', 'c'});
        computeAndPrint.accept(new int[]{10, 10, 2, 12, 9}, new char[]{'a', 'b', 'c', 'a', 'd'});
    }

    public static String bestHand(int[] ranks, char[] suits) {

        HashSet<Character> c = new HashSet<>();
        for (char suit : suits) c.add(suit);
        if (c.size() == 1) return "Flush";
        int[] occurrences = new int[14];
        for (int rank : ranks) occurrences[rank]++;
        for (int o : occurrences) if (o >= 3) return "Three of a Kind";
        for (int o : occurrences) if (o >= 2) return "Pair";
        return "High Card";
    }

    public static String bestHand1(int[] ranks, char[] suits) {

        Map<Character, List<Integer>> cards = new HashMap<>();

        for (int i = 0; i < ranks.length; i++) {
            char suit = suits[i];
            int rank = ranks[i];
            if (cards.containsKey(suit)) {
                cards.get(suit).add(rank);
            } else {
                cards.put(suits[i], new ArrayList<>());
                cards.get(suit).add(rank);
            }
        }

        Function<Map<Character, List<Integer>>, String> getHand = map -> {
            int[] occurrences = new int[14];
            for (List<Integer> v : map.values()) {
                if (v.size() == 5) return "Flush";
                for (Integer i : v) occurrences[i]++;
            }
            for (int o : occurrences) if (o >= 3) return "Three of a Kind";
            for (int o : occurrences) if (o >= 2) return "Pair";
            return "High Card";
        };
        return getHand.apply(cards);
    }
}
