package com.rloup.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailAddressesTest {

    private final UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();

    @Test
    void numUniqueEmails() {
        assertEquals(2, uniqueEmailAddresses.numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"}));

        assertEquals(3, uniqueEmailAddresses.numUniqueEmails(
                new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));

        assertEquals(1, uniqueEmailAddresses.numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"}));
    }
}