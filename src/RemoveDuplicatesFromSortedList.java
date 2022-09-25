import util.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode tempHead =
                new ListNode(1,
                             new ListNode(1,
                                          new ListNode(2,
                                                       new ListNode(3,
                                                                    new ListNode(3)))));

        tempHead = new ListNode();


        System.out.println(deleteDuplicates(tempHead));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode tempNode = head;

        while(tempNode != null && tempNode.next != null){
            if (tempNode.val == tempNode.next.val) {

                tempNode.next = tempNode.next.next;
            } else{
                tempNode = tempNode.next;
            }

        }

        return head;
    }
}


