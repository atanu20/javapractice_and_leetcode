package linkedlist_work;

public class Reorder_List {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        ListNode nex = null;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        ListNode temp = head;
        while (temp != null && prev.next != null) {
            ListNode pick = prev;
            prev = prev.next;
            pick.next = temp.next;
            temp.next = pick;
            temp = temp.next.next;

        }

        // while (prev != null) {
        // System.out.println("p"+prev.val);
        // prev = prev.next;

        // }
        // while (temp != null) {
        // System.out.println("t"+temp.val);
        // temp=temp.next;

        // }

    }
}
