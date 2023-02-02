package com.rloup.leetcode.problems;

public class CountNegativeNumbersInASortedMatrix {

    public static void main(String[] args) {
        int[][] martix1 =
                {{4, 3, 2, -1},
                        {3, 2, 1, -1},
                        {1, 1, -1, -2},
                        {-1, -1, -2, -3}};


        int[][] martix2 =
                {{3, 2},
                        {1, 0}};


        System.out.println(countNegatives(martix1));
        System.out.println(countNegatives(martix2));
    }


    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                int x = grid[i][j];
                if (x < 0) count++;
                if (x >= 0) break;
            }
        }
        return count;
    }
}
