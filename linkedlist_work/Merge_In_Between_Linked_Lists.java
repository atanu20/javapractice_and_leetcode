package linkedlist_work;

public class Merge_In_Between_Linked_Lists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur = list1;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while (t2.next != null) {
            t2 = t2.next;
        }
        for (int i = 0; i < a - 1; i++) {
            cur = cur.next;
        }
        for (int i = 0; i < b + 1; i++) {
            t1 = t1.next;
        }
        cur.next = list2;
        t2.next = t1;
        // System.out.println(t1.val);
        return list1;

        // ListNode cur=list1;

        // ListNode t2=list2;
        // while(t2.next!=null)
        // {
        // t2=t2.next;
        // }
        // int pos=0;
        // while(cur!=null)
        // {
        // if(pos==a-1)
        // {
        // ListNode p=cur.next;
        // cur.next=list2;
        // cur=p;
        // pos++;
        // }else if(pos==b+1){
        // t2.next=cur;
        // break;

        // }else{
        // cur=cur.next;
        // pos++;
        // }
        // }

    }
}
