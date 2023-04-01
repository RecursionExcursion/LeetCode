package com.rloup.leetcode.problems;

public class CalculateAmountPaidInTaxes {
    public static void main(String[] args) {

        System.out.println(calculateTax(new int[][]{{3, 50}, {7, 10}, {12, 25}}, 10));
        System.out.println(calculateTax(new int[][]{{1, 0}, {4, 25}, {5, 50}}, 2));
        System.out.println(calculateTax(new int[][]{{2, 50}}, 0));
    }

    public static double calculateTax(int[][] brackets, int income) {

        int i = 1;
        double sum = 0;

        for (int[] bracket : brackets) {
            while (i <= income && i <= bracket[0]) {
                sum += ((double) bracket[1] / 100);
                i++;
            }
        }
        return sum;
    }
}
