package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.ListNode;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
//		ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode listNode1 = new ListNode(2);
//		ListNode listNode1 = new ListNode(-10,
//				new ListNode(-10, new ListNode(-9, new ListNode(-4,
//						new ListNode(1, new ListNode(6, new ListNode(6)))))));
//		ListNode listNode1 = new ListNode(-9, new ListNode(3));
//		ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode listNode2 = new ListNode(1);
//		ListNode listNode2 = new ListNode(-7);
//		ListNode listNode2 = new ListNode(5, new ListNode(7));
		ListNode node = mergeTwoLists(listNode1, listNode2);
		System.out.println(node.val);
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 == null && list2 == null) {
			return null;
		}
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		ListNode startingNode = list1;
		ListNode otherNode = list2;

		if (list1.val > list2.val) {
			startingNode = list2;
			otherNode = list1;
		}

		ListNode currentNode = startingNode;

		ListNode tempNode;

		while (currentNode != null && otherNode != null) {

			if (currentNode.next != null) {

				if (currentNode.next.val >= otherNode.val) {

					tempNode = currentNode.next;

					currentNode.next = otherNode;

					otherNode = currentNode.next.next;

					currentNode.next.next = tempNode;

				}
			} else {
				currentNode.next = otherNode;
				break;
			}

			currentNode = currentNode.next;
		}

		return startingNode;

	}
	
	 public static ListNode mergeTwoListsBetter(ListNode list1, ListNode list2) {
	        if (list1 == null) {
	            return list2;
	        } else if (list2 == null) {
	            return list1;
	        } else if (list1.val <= list2.val) {
	            list1.next = mergeTwoLists(list1.next, list2);
	            return list1;
	        } else {
	            list2.next = mergeTwoLists(list1, list2.next);
	            return list2;
	        }
	    }

}
