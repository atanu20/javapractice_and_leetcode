package linkedlist_work;

public class Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        for (int i = 1; i < k; i++) {
            start = start.next;
        }
        ListNode kthformbeg = start;
        while (start.next != null) {
            end = end.next;
            start = start.next;
        }
        ListNode kthformend = end;
        int temp = kthformbeg.val;
        kthformbeg.val = kthformend.val;
        kthformend.val = temp;
        return head;

    }
}
