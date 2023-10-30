package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapNodesInPairsTest {

    private final SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    void swapPairs() {
        ListNode head = new ListNode(1,
                                         new ListNode(2,
                                                      new ListNode(3,
                                                                   new ListNode(4))));

        ListNode head2 = new ListNode(1,
                                     new ListNode(2,
                                                  new ListNode(3,
                                                               new ListNode(4,
                                                                            new ListNode(5)))));

        assertEquals(new int[]{2, 1, 4, 3, 5}, swapNodesInPairs.swapPairs(head2));
        assertEquals(new int[]{2, 1, 4, 3}, swapNodesInPairs.swapPairs(head));
    }
}