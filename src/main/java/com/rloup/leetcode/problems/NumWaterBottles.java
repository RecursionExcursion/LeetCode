package com.rloup.leetcode.problems;

public class NumWaterBottles {

    int drank = 0;
    int emptyBottles = 0;
    int fullBottles = 0;
    public int numWaterBottles(int numBottles, int numExchange) {
        fullBottles = numBottles;

        while (fullBottles != 0) {
           drinkWater();
           exchangeBottles(numExchange);
        }
        System.out.println();
        return drank;
    }

    private void drinkWater(){
            drank += fullBottles;
            emptyBottles += fullBottles;
            fullBottles = 0;
    }
    private void exchangeBottles(int exchangeRate){
        fullBottles = emptyBottles / exchangeRate;
        emptyBottles = emptyBottles % exchangeRate;
    }
}
