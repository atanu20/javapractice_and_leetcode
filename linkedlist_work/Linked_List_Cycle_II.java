package linkedlist_work;

public class Linked_List_Cycle_II {
    public static ListNode getpos(ListNode head, ListNode slow) {
        ListNode t = head;
        while (t != slow) {
            t = t.next;
            slow = slow.next;
        }
        return t;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (s == f)
                return getpos(head, s);
        }
        return null;
    }
}
