package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        System.out.println(hasCycle(root));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        List<ListNode> usedListNodes = new ArrayList<>();

        while (head.next != null) {
            if (usedListNodes.contains(head.next)) {
                return true;
            } else {
                usedListNodes.add(head);
                head = head.next;
            }
        }
        return false;
    }
}
