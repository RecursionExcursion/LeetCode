package com.rloup.leetcode.problems;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {

        Set<Integer> usedIndexes = new HashSet<>();
        int islands = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int index = getIndexFromCoords(grid, r, c);
                if (!usedIndexes.contains(index)) {
                    char val = grid[r][c];
                    if (val == 49) {
                        islands++;
                        addToIsland(grid, usedIndexes, r, c);
                    }
                }
            }
        }
        return islands;
    }

    private void checkSurroundingSquares(char[][] grid, int r, int c, Set<Integer> usedGridSquares) {

        BiConsumer<Integer, Integer> checkForLand = (row, col) -> {
            if (grid[row][col] == 49) {
                addToIsland(grid, usedGridSquares, row, col);
            }
        };
        //up
        if (r > 0) {
            checkForLand.accept(r - 1, c);
        }
        //down
        if (r < grid.length - 1) {
            checkForLand.accept(r + 1, c);
        }
        //left
        if (c > 0) {
            checkForLand.accept(r, c - 1);
        }
        //right
        if (c < grid[0].length - 1) {
            checkForLand.accept(r, c + 1);
        }
    }

    private void addToIsland(char[][] grid, Set<Integer> usedGridSquares, int r, int c) {
        int index = getIndexFromCoords(grid, r, c);
        if (!usedGridSquares.add(index)) return;
        checkSurroundingSquares(grid, r, c, usedGridSquares);
    }

    private int getIndexFromCoords(char[][] grid, int r, int c) {
        return (r * grid[0].length) + c;
    }
}

