package linkedlist_work;

public class removeZeroSumSublists {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0), p;
        dummy.next = head;
        p = dummy;
        int sum = 0;

        while (p != null) {
            // System.out.print(p.val+" ");
            sum += p.val;
            map.put(sum, p);
            p = p.next;
        }
        p = dummy;
        sum = 0;
        // System.out.println(map);
        while (p != null) {
            sum += p.val;

            if (map.containsKey(sum)) {
                ListNode temp = map.get(sum);
                // System.out.println(temp.val+" "+p.val+" "+sum);
                if (temp != p)
                    p.next = temp.next;
            }
            p = p.next;
        }
        return dummy.next;
    }
}
