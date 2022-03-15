package linkedlist_work;

public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode t = head;
        int p = 0;
        while (t != null) {
            p++;
            t = t.next;
        }
        k = k % p;
        k = p - k;
        t = head;
        Stack<Integer> ll1 = new Stack<>();
        Stack<Integer> l1 = new Stack<>();
        Stack<Integer> ll2 = new Stack<>();
        Stack<Integer> l2 = new Stack<>();
        for (int i = 0; i < k; i++) {
            l1.push(t.val);
            t = t.next;
        }
        for (int i = k; i < p; i++) {
            l2.push(t.val);
            t = t.next;
        }

        while (!l1.isEmpty()) {
            ll1.push(l1.pop());
        }

        while (!l2.isEmpty()) {
            ll2.push(l2.pop());
        }

        ListNode neww = new ListNode(0);
        ListNode an = neww;

        for (int i = k; i < p; i++) {
            an.next = new ListNode(ll2.pop());
            an = an.next;
        }

        for (int i = 0; i < k; i++) {
            an.next = new ListNode(ll1.pop());
            an = an.next;
        }

        return neww.next;

    }
}
