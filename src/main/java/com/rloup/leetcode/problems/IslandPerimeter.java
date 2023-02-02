package com.rloup.leetcode.problems;

public class IslandPerimeter {
    public static void main(String[] args) {

        int[][] island = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int[][] island2 = {{1}};
        int[][] island3 = {{1, 0}};


        System.out.println(islandPerimeter(island));
        System.out.println(islandPerimeter(island2));
        System.out.println(islandPerimeter(island3));
    }


    private static int islandPerimeter(int[][] grid) {
        int sides = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) sides++;
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) sides++;
                    if (j == 0 || grid[i][j - 1] == 0) sides++;
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) sides++;
                }
            }
        }
        return sides;
    }
}
