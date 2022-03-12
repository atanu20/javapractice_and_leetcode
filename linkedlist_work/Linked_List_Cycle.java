package linkedlist_work;

public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode first = head;
        ListNode last = head;
        while (first != null && first.next != null) {

            first = first.next.next;
            last = last.next;
            if (first == last)
                return true;
        }
        return false;
    }
}
