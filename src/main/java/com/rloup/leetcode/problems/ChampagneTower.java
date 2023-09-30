package com.rloup.leetcode.problems;

public class ChampagneTower {

    public double champagneTower(int poured, int query_row, int query_glass) {

        //Set up Tower
        double[][] tower = new double[100][];
        for (int i = 0; i < 100; i++) {
            tower[i] = new double[i + 1];
        }

        //Pour in cup 1
        tower[0][0] = poured;

        //Trickle down
        for (int y = 0; y < tower.length; y++) {
            double overflow = 0;
            for (int x = 0; x < tower[y].length; x++) {
                //If cup is overflowing
                if (tower[y][x] > 1) {
                    double extra = tower[y][x] - 1;
                    tower[y][x] = 1;
                    if (y < 99) {
                        double halfFlow = extra / 2;
                        tower[y + 1][x] += halfFlow;
                        tower[y + 1][x + 1] += halfFlow;
                        overflow += extra;
                    }
                }
            }
            if (overflow <= 0) break;
        }

        return tower[query_row][query_glass];
    }
}
