package linkedlist_work;

public class Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {

        TreeMap<Integer, Integer> l = new TreeMap<>();
        ListNode cur = head;
        while (cur != null) {
            l.put(cur.val, l.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }
        // System.out.println(l);
        ListNode ans = new ListNode(0);
        ListNode an = ans;
        for (Map.Entry<Integer, Integer> m : l.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
            int v = m.getValue();
            if (v == 1) {
                an.next = new ListNode(m.getKey());
                an = an.next;
            }
        }

        return ans.next;
    }

    // public ListNode deleteDuplicates(ListNode head) {

    // ListNode ans=new ListNode(0,head);
    // ListNode an=ans;
    // ListNode cur=head;

    // while(cur!=null)
    // {
    // if(cur.next !=null && cur.val==cur.next.val)
    // {
    // while(cur.next !=null && cur.val==cur.next.val)
    // {
    // cur=cur.next;
    // }
    // an.next=cur.next;

    // }else{
    // an=an.next;
    // }
    // cur=cur.next;
    // }

    // return ans.next;
    // }
}
