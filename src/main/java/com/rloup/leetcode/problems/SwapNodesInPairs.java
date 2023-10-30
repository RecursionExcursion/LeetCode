package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SwapNodesInPairs {
//    public ListNode swapPairs(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//
//        ListNode current = head;
//        List<ListNode> listNodes = new ArrayList<>();
//        listNodes.add(head);
//
//
//        while (current.next != null) {
//            listNodes.add(current.next);
//            current = current.next;
//        }
//
//        for (int i = 0; i < listNodes.size(); i += 2) {
//
//            if (listNodes.get(i).next != null) {
//                ListNode temp = listNodes.get(i + 1);
//                listNodes.set(i + 1, listNodes.get(i));
//                listNodes.set(i, temp);
//            }
//        }
//        for (int i = 0; i < listNodes.size(); i++) {
//            current = listNodes.get(i);
//            ListNode next;
//            if (i < listNodes.size() - 1) {
//                next = listNodes.get(i + 1);
//            } else {
//                next = null;
//            }
//            current.next = next;
//        }
//
//        return listNodes.get(0);
//    }
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(head);


        while (current.next != null) {
            listNodes.add(current.next);
            current = current.next;
        }

        for (int i = 0; i < listNodes.size(); i += 2) {

            if (listNodes.get(i).next != null) {
                ListNode temp = listNodes.get(i + 1);
                listNodes.set(i + 1, listNodes.get(i));
                listNodes.set(i, temp);
            }
        }
        for (int i = 0; i < listNodes.size(); i++) {
            current = listNodes.get(i);
            ListNode next;
            if (i < listNodes.size() - 1) {
                next = listNodes.get(i + 1);
            } else {
                next = null;
            }
            current.next = next;
        }

        return listNodes.get(0);
    }
}
