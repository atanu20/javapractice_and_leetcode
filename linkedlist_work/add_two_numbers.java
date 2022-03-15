package linkedlist_work;

public class add_two_numbers {
    public static ListNode reverse(ListNode node) {
        ListNode cur = node;
        ListNode prev = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // l1=reverse(l1);
        // l2=reverse(l2);

        ListNode newNode = new ListNode(0);
        int carry = 0;
        ListNode crt = newNode;
        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;

            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            crt.next = new ListNode(sum % 10);
            crt = crt.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry > 0) {
            crt.next = new ListNode(carry);
            crt = crt.next;
        }
        return newNode.next;

    }
}
