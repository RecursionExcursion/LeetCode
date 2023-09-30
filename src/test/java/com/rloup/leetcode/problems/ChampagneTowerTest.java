package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChampagneTowerTest {

    private final ChampagneTower champagneTower = new ChampagneTower();

    @Test
    void champagneTower() {

//        double test10 = champagneTower.champagneTower(65, 1, 1);
//
//        double test1 = champagneTower.champagneTower(1, 1, 1);
        double test2 = champagneTower.champagneTower(2, 1, 1);
        double test3 = champagneTower.champagneTower(100000009, 33, 17);
        double test4 = champagneTower.champagneTower(1000000009, 99, 99);

//        assertEquals(0.00000, test1);
        assertEquals(0.50000, test2);
        assertEquals(1.00000, test3);
    }
}