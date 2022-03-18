package linkedlist_work;

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        List<Integer> even = new ArrayList<>();

        ListNode l = new ListNode(0);
        ListNode ans = l;
        int p = 0;
        while (head != null) {
            if (p % 2 != 0) {
                even.add(head.val);
            } else {
                ans.next = new ListNode(head.val);
                ans = ans.next;
            }
            head = head.next;
            p++;
        }

        for (int i = 0; i < even.size(); i++) {
            ans.next = new ListNode(even.get(i));
            ans = ans.next;
        }

        return l.next;
    }
}
