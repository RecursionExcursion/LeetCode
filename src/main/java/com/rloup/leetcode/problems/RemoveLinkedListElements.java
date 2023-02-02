package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.ListNode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
//        ListNode nodes = new ListNode(1,
//                                      new ListNode(2,
//                                                   new ListNode(6,
//                                                                new ListNode(3,
//                                                                             new ListNode(4,
//                                                                                          new ListNode(5,
//                                                                                                       new ListNode(6)))))));
        ListNode nodes = new ListNode(7,
                                      new ListNode(7,
                                                   new ListNode(7,
                                                                new ListNode(7))));

        System.out.println(removeElements(null, 7));
    }


    public static ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        ListNode previousNode = null;

        while (node != null) {
            if (node.val == val) {
                if (previousNode != null) {
                    previousNode.next = node.next;
                    node = node.next;
                } else {
                    head = node.next == null ? null : node.next;
                    node = head;
                }
                continue;
            }
            previousNode = node;
            node = node.next;
        }

        return head;

    }
}
