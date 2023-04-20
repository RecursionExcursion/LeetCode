package com.rloup.leetcode.problems;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int largestSquare = 0;
        for (int row = 0; row < matrix.length - Math.sqrt(largestSquare); row++) {
            for (int col = 0; col < matrix[row].length - Math.sqrt(largestSquare); col++) {
                if (matrix[row][col] == 49) {
                    largestSquare = Math.max(largestSquare, 1);
                    int numOfRows = getNumOfRows(matrix, row, col);
                    int numOfCols = getNumOfCols(matrix, row, col);
                    if (numOfRows > 1 && numOfCols > 1) {
                        int min = Math.min(numOfCols, numOfRows);
                        for (int i = 1; i < min; i++) {
                            min = Math.min(min, getNumOfCols(matrix, row + i, col));
                        }
                        largestSquare = (int) Math.max(largestSquare, Math.pow(min, 2));
                    }
                }
            }
        }
        return largestSquare;
    }

    private int getNumOfCols(char[][] matrix, int r, int c) {
        int n = 0;
        while (c < matrix[0].length && matrix[r][c++] == 49) n++;
        return n;
    }

    private int getNumOfRows(char[][] matrix, int r, int c) {
        int n = 0;
        while (r < matrix.length && matrix[r++][c] == 49) n++;
        return n;
    }
}
