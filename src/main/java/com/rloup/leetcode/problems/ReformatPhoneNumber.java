package com.rloup.leetcode.problems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        String formatted = number.replace("-", "").replace(" ", "");

        StringBuilder returnString = new StringBuilder();

        while (formatted.length() > 4) {

            for (int i = 0; i < 3; i++) {
                String index = String.valueOf(formatted.charAt(0));
                returnString.append(index);
                formatted = formatted.substring(1);

            }

            returnString.append("-");

        }
        if (formatted.length() == 4) {
            for (int i = 0; i < 2; i++) {
                String index = String.valueOf(formatted.charAt(0));
                returnString.append(index);
                formatted = formatted.substring(1);

            }
            returnString.append("-");
        }
        for (String x : formatted.split("")) {

            returnString.append(x);
        }

        return returnString.toString();
    }

    public String reformatNumber2(String number) {

        ArrayDeque<String> numbersDQ = Arrays.stream(number.split(""))
                                             .filter(s -> !s.equals("-"))
                                             .filter(s -> !s.equals(" "))
                                             .collect(Collectors.toCollection(ArrayDeque::new));


        StringBuilder sb = new StringBuilder();

        while (numbersDQ.size() > 4) {
            for (int i = 0; i < 3; i++) {
                sb.append(numbersDQ.poll());
            }
            sb.append("-");
        }
        if (numbersDQ.size() == 3) {
            while (!numbersDQ.isEmpty()) {
                sb.append(numbersDQ.poll());
            }
        }
        if (numbersDQ.size() != 0) {
            int f = 2;
            for (int i = 0; i < f; i++) {
                sb.append(numbersDQ.poll());
            }
            if (numbersDQ.size() != 0) {
                sb.append("-");
                for (int i = 0; i < f; i++) {
                    sb.append(numbersDQ.poll());
                }
            }
        }

        return sb.toString();
    }
}
