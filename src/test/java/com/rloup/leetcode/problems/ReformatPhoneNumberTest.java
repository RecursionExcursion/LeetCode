package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReformatPhoneNumberTest {

    private static final ReformatPhoneNumber reformatPhoneNumber = new ReformatPhoneNumber();

    @Test
    void reformatNumber() {
         assertEquals("123-456",reformatPhoneNumber.reformatNumber("1-23-45 6"));
         assertEquals("123-45-67",reformatPhoneNumber.reformatNumber("123 4-567"));
         assertEquals("123-456-78",reformatPhoneNumber.reformatNumber("123 4-5678"));
    }
}