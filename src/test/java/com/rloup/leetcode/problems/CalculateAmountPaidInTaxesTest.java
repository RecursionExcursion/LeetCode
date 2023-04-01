package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAmountPaidInTaxesTest {

    @Test
    void calculateTax() {
        CalculateAmountPaidInTaxes calculateAmountPaidInTaxes = new CalculateAmountPaidInTaxes();

        double v = calculateAmountPaidInTaxes.calculateTax(new int[][]{{3, 50}, {7, 10}, {12, 25}}, 10);
        double v2 = calculateAmountPaidInTaxes.calculateTax(new int[][]{{1,0},{4,25},{5,50}}, 2);
        double v3 = calculateAmountPaidInTaxes.calculateTax(new int[][]{{2,50}}, 0);

        assertEquals(v, 2.65);
        assertEquals(v2, 0.25);
        assertEquals(v3, 0);
    }
}