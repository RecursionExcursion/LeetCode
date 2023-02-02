package com.rloup.leetcode.problems;

import java.util.Arrays;

public class AddDigits {
    public static void main(String[] args) {
        int n = 83;
        int n2 = 12345;

        System.out.println(addDigits4(n));
        System.out.println(addDigits4(n2));

    }

    public static int addDigits(int num) {

        while (num > 9) {
            int sum = 0;
            long index = num * 10L;
            for (int i = 0; index != 0; i++, index = index / 10) {
                sum += (((int) (num / Math.pow(10, i))) - ((int) (num / Math.pow(10, i + 1)) * 10));
            }
            num = sum;
        }
        return num;
    }

    public static int addDigitsEasyRead(int num) {

        while (num > 9) {

            int sum = 0;
            long index = num * 10L;
            for (int i = 0; index != 0; i++, index = index / 10) {
                int a = (int) (num / Math.pow(10, i));
                int b = ((int) (num / Math.pow(10, i + 1)) * 10);
                sum += (a - b);
            }
            num = sum;
        }
        return num;
    }

    public static int addDigits2(int num) {
        while (num > 9) {
            num = Arrays.stream(String.valueOf(num).split(""))
                        .map(Integer::parseInt)
                        .reduce(0, Integer::sum);
        }
        return num;
    }

    public static int addDigits3(int num) {
        while (num > 9) {
            String s = String.valueOf(num);
            num = 0;
            for (String i : s.split("")) num += Integer.parseInt(i);
        }
        return num;
    }

    public static int addDigits4(int num) {
        int x = (num - 1);
        int y = x % 9;


        return 1 + y;
    }
}