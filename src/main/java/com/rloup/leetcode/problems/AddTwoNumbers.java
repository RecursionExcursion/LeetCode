package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode head1 = new ListNode(2,
//                                      new ListNode(4,
//                                                   new ListNode(3
//                                                               )));
//
//        ListNode head2 = new ListNode(5,
//                                      new ListNode(6,
//                                                   new ListNode(4)));


//        ListNode head1 = new ListNode(9,
//                                      new ListNode(9,
//                                                   new ListNode(9,
//                                                                new ListNode(9,
//                                                                             new ListNode(9,
//                                                                                          new ListNode(9,
//                                                                                                       new ListNode(9
//                                                                                                       )))))));
//
//        ListNode head2 = new ListNode(9,
//                                      new ListNode(9,
//                                                   new ListNode(9,
//                                                                new ListNode(9))));
        ListNode head1 = new ListNode(5,
                                      new ListNode(6,
                                                   new ListNode(4,
                                                                new ListNode(9))));

        ListNode head2 = new ListNode(2,
                                      new ListNode(4,
                                                   new ListNode(9
                                                   )));

        ListNode node = addTwoNumbers(head1, head2);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(-1);
        ListNode head = node;
        int carry = 0;
        boolean doOnce = true;

        while (l1 != null || l2 != null) {

            int sum = carry;
            carry = 0;

            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            sum += val1 + val2;

            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            }

            if (doOnce) {
                node.val = sum;
                doOnce = false;
            } else {
                node.next = new ListNode(sum);
                node = node.next;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry != 0) {
            node.next = new ListNode(1);
        }

        return head;
    }
}
