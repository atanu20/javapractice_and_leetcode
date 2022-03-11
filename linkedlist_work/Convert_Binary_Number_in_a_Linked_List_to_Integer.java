package linkedlist_work;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public int getDecimalValue(ListNode head) {
        ListNode nex = null;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;

        }
        head = prev;
        nex = head;
        int sum = 0, i = 0;
        while (nex != null) {
            sum += nex.val * (Math.pow(2, i++));
            nex = nex.next;
        }

        return sum;

        /*
         * int ans=0;
         * while(head!=null){
         * ans=ans*2+head.val;
         * head=head.next;
         * }
         * return ans;
         */
    }
}
