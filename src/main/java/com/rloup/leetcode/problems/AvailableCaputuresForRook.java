package com.rloup.leetcode.problems;

import java.util.function.BiFunction;

public class AvailableCaputuresForRook {
    public static void main(String[] args) {
        char[][] board1 =
                {{'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', '.', '.', 'p', '.', '.', '.', '.' },
                        {'.', '.', '.', 'R', '.', '.', '.', 'p' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', '.', '.', 'p', '.', '.', '.', '.' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' }};

        char[][] board2 =
                {{'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.' },
                        {'.', 'p', 'B', 'R', 'B', 'p', '.', '.' },
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.' },
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' }};

        char[][] board3 =
                {{'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', '.', '.', 'p', '.', '.', '.', '.' },
                        {'.', '.', '.', 'p', '.', '.', '.', '.' },
                        {'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' },
                        {'.', '.', '.', 'B', '.', '.', '.', '.' },
                        {'.', '.', '.', 'p', '.', '.', '.', '.' },
                        {'.', '.', '.', '.', '.', '.', '.', '.' }};

        System.out.println(numRookCaptures(board1));
        System.out.println(numRookCaptures(board2));
        System.out.println(numRookCaptures(board3));

    }

    private static int numRookCaptures(char[][] board) {

        int rCol = -1;
        int rRow = -1;


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char square = board[i][j];
                if (square == 82) {
                    rCol = j;
                    rRow = i;
                    break;
                }
            }
            if (rCol != -1) break;
        }

        BiFunction<Integer, Integer, Boolean> yNeg = (x, y) -> {
            y--;
            while (y >= 0) {
                char c = board[x][y];
                if (c >= 97 && c <= 122) return true;
                if (c >= 65 && c <= 90) break;
                y--;
            }
            return false;
        };
        BiFunction<Integer, Integer, Boolean> yPos = (x, y) -> {
            y++;
            while (y < board.length) {
                char c = board[x][y];
                if (c >= 97 && c <= 122) return true;
                if (c >= 65 && c <= 90) break;
                y++;
            }
            return false;
        };
        BiFunction<Integer, Integer, Boolean> xNeg = (x, y) -> {
            x--;
            while (x >= 0) {
                char c = board[x][y];
                if (c >= 97 && c <= 122) return true;
                if (c >= 65 && c <= 90) break;
                x--;
            }
            return false;
        };
        BiFunction<Integer, Integer, Boolean> xPos = (x, y) -> {
            x++;
            while (x < board.length) {
                char c = board[x][y];
                if (c >= 97 && c <= 122) return true;
                if (c >= 65 && c <= 90) break;
                x++;
            }
            return false;
        };
        int numOfAttacks = 0;

        if(yPos.apply(rRow,rCol)) numOfAttacks++;
        if(yNeg.apply(rRow,rCol)) numOfAttacks++;
        if(xPos.apply(rRow,rCol)) numOfAttacks++;
        if(xNeg.apply(rRow,rCol)) numOfAttacks++;


        return numOfAttacks;

    }
}
