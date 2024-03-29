package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {

    public static void main(String[] args) {


        char[][] board =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board2 =
                {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};


        char[][] board3 =
                {{'.', '4', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '4', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '1', '.', '.', '7', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '3', '.', '.', '.', '6', '.'},
                        {'.', '.', '.', '.', '.', '6', '.', '9', '.'},
                        {'.', '.', '.', '.', '1', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                        {'.', '.', '.', '8', '.', '.', '.', '.', '.'}};

        char[][] board4 =
                        {{'.', '.', '.', '.', '.', '.', '5', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
                        {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '3', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '5', '2', '.', '.'}};

        System.out.println(isValidSudoku(board));
        System.out.println(isValidSudoku(board2));
        System.out.println(isValidSudoku(board3));
        System.out.println(isValidSudoku(board4));
    }

    private static boolean isValidSudoku(char[][] board) {

        Set<Character> rowSet = new HashSet<>();
        Set<Character> colSet = new HashSet<>();
        List<Set<Character>> boxSets = new ArrayList<>(3);

        while (boxSets.size() < 3) boxSets.add(new HashSet<>());

        for (int r = 0; r < 9; r++) {

            rowSet.clear();
            colSet.clear();

            if (r % 3 == 0) {
                boxSets.forEach(Set::clear);
            }

            for (int c = 0; c < 9; c++) {

                char nRow = board[r][c];
                char nCol = board[c][r];

                if (canAddToCharSet(nRow, rowSet)) return false;
                if (canAddToCharSet(nCol, colSet)) return false;

                if (c < 3) {
                    if (canAddToCharSet(nRow, boxSets.get(0))) return false;
                } else if (c < 6) {
                    if (canAddToCharSet(nRow, boxSets.get(1))) return false;
                } else {
                    if (canAddToCharSet(nRow, boxSets.get(2))) return false;
                }
            }
        }
        return true;
    }

    private static boolean canAddToCharSet(char c, Set<Character> charSet) {
        if (c != '.') {
            return !charSet.add(c);
        }
        return false;
    }
}
