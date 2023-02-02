package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.ListNode;

public class PartitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                                     new ListNode(4,
                                                  new ListNode(3,
                                                               new ListNode(2,
                                                                            new ListNode(5,
                                                                                         new ListNode(2))))));
        ListNode head2 = new ListNode(2,
                                      new ListNode(1));

        ListNode head3 = new ListNode(1,
                                      new ListNode(1));


        System.out.println(partition(head, 3).val);
        System.out.println(partition(head2, 2).val);
        System.out.println(partition(head2, 1).val);
        System.out.println(partition(head3, 2).val);

    }



    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode returnHead = new ListNode();
        ListNode returnNode = returnHead;
        ListNode node = head;
        int index = 0;

        while (node != null) {
            index++;
            if (node.val < x) {
                index--;
                returnNode.val = node.val;
                if (node.next != null || index != 0) {
                    returnNode.next = new ListNode();
                    returnNode = returnNode.next;
                }
            }
            node = node.next;
        }
        if (index > 0) {
            node = head;

            while (node != null && index > 0) {
                if (node.val >= x) {
                    index--;
                    returnNode.val = node.val;
                    if (index > 0) {
                        returnNode.next = new ListNode();
                        returnNode = returnNode.next;
                    }
                }
                node = node.next;
            }
        }
        return returnHead;
    }

}
