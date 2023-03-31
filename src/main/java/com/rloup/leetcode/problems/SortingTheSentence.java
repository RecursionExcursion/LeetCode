package com.rloup.leetcode.problems;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String s2 = "Myself2 Me1 I4 and3";

        System.out.println(sortSentence(s));
        System.out.println(sortSentence(s2));
    }

    public static String sortSentence(String s) {

        String[] words = s.split(" ");

        int length = words.length;
        int index = 1;

        StringBuilder sb = new StringBuilder();

        while (index <= length) {
            for (String word : words) {
                if (word.charAt(word.length() - 1) == 48 + index) {
                    sb.append(word, 0, word.length() - 1).append(" ");
                    index++;
                }
            }
        }
        return sb.toString().stripTrailing();
    }

    public static String sortSentence1(String s) {

        String[] words = s.split(" ");

        int length = words.length;
        int index = 1;

        StringBuilder sb = new StringBuilder();

        while (index <= length) {
            for (String word : words) {
                if (word.charAt(word.length() - 1) == 48 + index) {
                    sb.append(word.split("\\d")[0]).append(" ");
                    index++;
                }
            }
        }
        return sb.toString().trim();
    }
}
