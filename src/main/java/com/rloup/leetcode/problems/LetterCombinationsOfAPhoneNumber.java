package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations("679"));
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {

        List<List<String>> phoneButtons = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            phoneButtons.add(getLetters(Integer.parseInt(String.valueOf(c))));
        }

        int listValue = 1;
        for (List<String> l : phoneButtons) {
            listValue *= l.size();
        }

        List<String> returnList = new ArrayList<>();

        for (List<String> currentList : phoneButtons) {

            listValue /= currentList.size();

            if (returnList.isEmpty()) {
                for (String s : currentList) {
                    for (int j = 0; j < listValue; j++) {
                        returnList.add(s);
                    }
                }
            } else {
                for (int i = 0, index = 0; i < returnList.size(); ) {
                    for (int j = 0; j < listValue; j++) {
                        returnList.set(i, returnList.get(i++) + currentList.get(index));
                    }
                    if (++index >= currentList.size()) {
                        index = 0;
                    }
                }
            }
        }
        return returnList;
    }

    private static List<String> getLetters(int i) {
        List<String> letters = new ArrayList<>();

        int asciiIndex = i < 8 ? 97 + ((i - 2) * 3) : 97 + ((i - 2) * 3) + 1;

        for (int x = 0; x < (i == 7 || i == 9 ? 4 : 3); x++) {
            letters.add(String.valueOf((char) asciiIndex++));
        }

        return letters;
    }
}