package linkedlist_work;

public class merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode tail = first;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }
        return first.next;
    }
}