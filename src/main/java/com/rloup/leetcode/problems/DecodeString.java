package com.rloup.leetcode.problems;

import java.util.function.Function;
import java.util.function.Predicate;

public class DecodeString {
    public String decodeString(String s) {

        Predicate<Character> isNumber = c -> c >= 48 && c <= 57;
        Predicate<Character> isOpenBracket = c -> c == 91;
        Predicate<Character> isCloseBracket = c -> c == 93;

        Function<String, String> decodeFirstSectionFound = str -> {

            //Demarcate brackets, stop when found first complete set
            int lastOpenIndex = 0;
            int closeIndex = str.length();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (isOpenBracket.test(c)) {
                    lastOpenIndex = i;
                } else if (isCloseBracket.test(c)) {
                    closeIndex = i;
                    break;
                }
            }
            //Get String
            String substring = str.substring(lastOpenIndex + 1, closeIndex);

            //Check for multi digit number
            int x = lastOpenIndex;
            while (x > 0 && isNumber.test(str.charAt(x - 1))) {
                x--;
            }

            //Resolve freq of substring
            String stringVal = str.substring(x, lastOpenIndex);
            int freq = Integer.parseInt(stringVal);

            //Replace section with new string
            String fullSubString = str.substring(x, closeIndex + 1);
            String returnString = substring.repeat(freq);
            return str.replace(fullSubString, returnString);
        };

        Predicate<String> isFinished = str -> {
            for (char c : str.toCharArray()) {
                if (isNumber.test(c)) return false;
                if (isOpenBracket.test(c)) return false;
                if (isCloseBracket.test(c)) return false;
            }
            return true;
        };

        while (!isFinished.test(s)) {
            s = decodeFirstSectionFound.apply(s);
        }

        return s;
    }
}
