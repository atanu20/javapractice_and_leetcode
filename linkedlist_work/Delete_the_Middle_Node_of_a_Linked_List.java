package linkedlist_work;

public class Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        // ListNode fast = head;
        // ListNode slow = head;
        // ListNode temp=null;

        // int p = 0;

        // while (fast!= null) {
        // fast = fast.next;
        // p++;
        // }

        // if(p==1)
        // {
        // return null;
        // }
        // else{
        // fast=head;
        // while (fast != null && fast.next != null) {
        // fast = fast.next.next;
        // temp=slow;
        // slow = slow.next;

        // }

        // temp.next=slow.next;
        // }

        // return head;

        if (head == null || head.next == null)
            return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = curr;
            curr = curr.next;
            fast = fast.next.next;
        }

        prev.next = curr.next;
        return head;
    }
}
