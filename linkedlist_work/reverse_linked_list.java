package linkedlist_work;

public class reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        // head=prev;
        return prev;

        // ListNode curr = head;
        // ListNode prev = null;
        // ListNode n = new ListNode();
        // while(curr!=null){
        // // preserve
        // n = curr.next;
        // // make connection
        // curr.next = prev;
        // // move/update
        // prev = curr;
        // curr = n;
        // }
        // return prev;
    }
}
