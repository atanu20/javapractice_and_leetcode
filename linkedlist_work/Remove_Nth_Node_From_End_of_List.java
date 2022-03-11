package linkedlist_work;

public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;

        int p = 0;
        ListNode fast = head;
        ListNode temp = null;

        while (fast != null) {
            fast = fast.next;
            p++;
        }
        n = p - n;
        fast = head;
        if (n == 0) {
            head = head.next;
            return head;
        }

        for (int i = 0; i < n; i++) {
            temp = fast;
            fast = fast.next;
        }
        temp.next = fast.next;
        return head;
    }
}
