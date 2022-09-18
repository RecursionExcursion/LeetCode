package IntersectionOfTwoLinkedLists;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        a1.next = a2;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        b1.next = b2;
        b2.next = b3;

        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        c1.next = c2;
        c2.next = c3;

        a2.next = c1;
        b3.next = c1;

        System.out.println(getIntersectionNode2(a1, b1).val);
    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode nodeA = headA;
        ListNode nodeB;

        while (nodeA!= null) {
            nodeB = headB;
            while (nodeB != null) {
                if (nodeA == nodeB) {
                    return nodeA;
                }
                nodeB = nodeB.next;
            }
            nodeA = nodeA.next;
        }
        return null;
    }
    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }


}
