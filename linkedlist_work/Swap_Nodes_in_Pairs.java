package linkedlist_work;

public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp = head;
        while (temp != null) {
            if (temp.next == null)
                return head;
            int t = temp.val;
            temp.val = temp.next.val;
            temp.next.val = t;

            temp = temp.next.next;
        }
        return head;

    }
}
