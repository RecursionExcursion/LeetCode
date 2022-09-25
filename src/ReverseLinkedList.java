import util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode nodes = new ListNode(1,
                                      new ListNode(2,
                                                   new ListNode(3,
                                                                new ListNode(4,
                                                                             new ListNode(5)))));
        ListNode nodes2 = new ListNode(1,
                                       new ListNode(2));


        ListNode newHead = reverseListRec(nodes);

        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Set<ListNode> usedNodes = new HashSet<>();
        ListNode reversedHead = null;
        ListNode reversedNode = null;
        ListNode node = head;

        while (reversedNode != head) {
            if (node.next == null || usedNodes.contains(node.next)) {
                if (reversedHead == null) {
                    reversedHead = node;
                    reversedNode = reversedHead;
                } else {
                    reversedNode.next = node;
                    reversedNode = reversedNode.next;
                }
                usedNodes.add(node);
                node = head;
            } else {
                node = node.next;
            }
        }
        reversedNode.next = null;

        return reversedHead;
    }

    public static ListNode reverseListRec(ListNode head) {
        // base case
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseListRec(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
