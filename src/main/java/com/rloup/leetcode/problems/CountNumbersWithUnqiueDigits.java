package com.rloup.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class CountNumbersWithUnqiueDigits {
    public static void main(String[] args) {


        System.out.println(countNumbersWithUniqueDigits(0));
        System.out.println(countNumbersWithUniqueDigits(1));
        System.out.println(countNumbersWithUniqueDigits(2));
        System.out.println(countNumbersWithUniqueDigits(3));
        System.out.println(countNumbersWithUniqueDigits(4));
        System.out.println(countNumbersWithUniqueDigits(7));
        System.out.println(countNumbersWithUniqueDigits(8));

    }


    private static int countNumbersWithUniqueDigits(int n) {
        double cap = Math.pow(10, n);

        int notUniqueCount = 0;
        Set<Character> used = new HashSet<>();
        for (int i = 0; i < cap; i++) {

            String numString = String.valueOf(i);

            for (int j = 0; j < numString.length(); j++) {

                char c = numString.charAt(j);

                if (!used.add(c)) {
                    int y = (numString.length() - 1) - j;

                    if (y > 1) {
                        double x = Math.pow(10, y);
                        i = i + (int) x;
                        i--;
                        notUniqueCount += (x * 1);
                    } else {
                        notUniqueCount++;
                    }
                    break;
                }
            }
            used.clear();
        }
        return ((int) cap - notUniqueCount);
    }

//    private static int countNumbersWithUniqueDigits(int n) {
//        double cap = Math.pow(10, n);
//
//        int notUniqueCount = 0;
//        Set<Character> used = new HashSet<>();
//        for (int i = 0; i < cap; i++) {
//
//            String numString = String.valueOf(i);
//
//            for (int j = 0; j < numString.length(); j++) {
//
//                char c = numString.charAt(j);
//
//                if (!used.add(c)) {
//                    int y = (numString.length() - 1) - j;
//
//                    if (y > 1) {
//                        double x = Math.pow(10, y);
//                        i = i + (int) x;
//                        i--;
//                        notUniqueCount += (x * 1);
//                    } else {
//                        notUniqueCount++;
//                    }
//                    break;
//                }
//            }
//            used.clear();
//        }
//        return ((int) cap - notUniqueCount);
//    }


}
