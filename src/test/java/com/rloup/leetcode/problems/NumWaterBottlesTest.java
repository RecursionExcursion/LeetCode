package com.rloup.leetcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumWaterBottlesTest {

    private NumWaterBottles num;


    @Test
    void numWaterBottles() {
        resetState();
        assertEquals(13, num.numWaterBottles(9,3));
        resetState();
        assertEquals(19, num.numWaterBottles(15,4));
        resetState();
        assertEquals(25, num.numWaterBottles(17,3));
    }
    private  void resetState(){
        num = new NumWaterBottles();
    }
}