package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CountVowelSubstringsOfAString {
    public int countVowelSubstrings(String word) {

        List<String> vowelStrings = new ArrayList<>();

        Predicate<String> isVowelString =
                s -> {
                    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
                    char[] chars = s.toCharArray();
                    for (char c : chars) {
                        if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
                            for (int i = 0; i < vowels.length; i++) {
                                if(vowels[i] == c){
                                    vowels[i] = '0';
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                    for (char v : vowels) {
                        if(v != '0') return false;
                    }
                    return true;
                };


        for (int i = 0; i < word.length() - 4; i++) {
            for (int j = i + 5; j <= word.length(); j++) {
                String ss = word.substring(i, j);
                if (isVowelString.test(ss)) {
                    vowelStrings.add(ss);
                }
            }
        }

        return vowelStrings.size();
    }
}
