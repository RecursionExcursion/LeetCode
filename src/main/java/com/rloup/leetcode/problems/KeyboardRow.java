package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] words2 = new String[]{"omk"};
        String[] words3 = new String[]{"adsdf", "sfd"};
        String[] words4 = new String[]{"Aasdfghjkl", "Qwertyuiop", "zZxcvbnm"};

        Consumer<String[]> printStrings = arr -> {
            for (String s : arr) {
                System.out.print(s + ", ");
            }
            System.out.println();
        };

        printStrings.accept(findWords(words));
        printStrings.accept(findWords(words2));
        printStrings.accept(findWords(words3));
        printStrings.accept(findWords(words4));
    }

    public static String[] findWords(String[] words) {

        char[] firstRowChars = "qwertyuiop".toCharArray();
        char[] secondRowChars = "asdfghjkl".toCharArray();
        char[] thirdRowChars = "zxcvbnm".toCharArray();

        BiPredicate<char[], Character> isInRow = (charArr, c) -> {
            for (char rowChar : charArr) {
                if (rowChar == c) return true;
            }
            return false;
        };

        List<String> validStrings = new ArrayList<>(words.length);

        for (String word : words) {

            char[] chars = word.toLowerCase().toCharArray();

            boolean firstRow = false;
            boolean secondRow = false;
            boolean thirdRow = false;

            boolean hasMultipleRows = false;

            for (char c : chars) {
                if (!firstRow) firstRow = isInRow.test(firstRowChars, c);
                if (!secondRow) secondRow = isInRow.test(secondRowChars, c);
                if (!thirdRow) thirdRow = isInRow.test(thirdRowChars, c);

                hasMultipleRows = (firstRow && (secondRow || thirdRow)) || (secondRow && thirdRow);

                if (hasMultipleRows) break;
            }
            if (!hasMultipleRows) validStrings.add(word);
        }
        return validStrings.toArray(String[]::new);
    }
}
