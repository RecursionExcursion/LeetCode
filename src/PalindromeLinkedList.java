import util.ListNode;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode nodes = new ListNode(1,
                                      new ListNode(2,
                                                   new ListNode(2,
                                                                new ListNode(1))));
        ListNode nodes2 = new ListNode(1,
                                       new ListNode(2,
                                                    new ListNode(3,
                                                                 new ListNode(2,
                                                                              new ListNode(1)))));
        ListNode nodes3 = new ListNode(1,
                                       new ListNode(3,
                                                    new ListNode(3,
                                                                 new ListNode(2,
                                                                              new ListNode(1)))));


        System.out.println(isPalindrome2(nodes));
        System.out.println(isPalindrome2(nodes2));
        System.out.println(isPalindrome2(nodes3));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode node = head;

        //Get list size
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }

        //reset node
        node = head;

        //Parse through half the list and then compare it to the second half
        Stack<Integer> valStack = new Stack<>();
        int index = 0;
        while (index < size / 2) {
            valStack.push(node.val);
            node = node.next;
            index++;
        }

        //account for first node if size is odd
        if (size % 2 == 1) {
            node = node.next;
        }

        while (!valStack.isEmpty()) {
            if (valStack.pop() != node.val) {
                return false;
            }
            node = node.next;
        }

        return true;
    }

    public static boolean isPalindrome2(ListNode head) {
        ListNode node = head;
        Stack<Integer> valStack = new Stack<>();

        while (node != null) {
            valStack.push(node.val);
            node = node.next;
        }

        while (!valStack.isEmpty()) {
            if (head.val != valStack.pop()) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
