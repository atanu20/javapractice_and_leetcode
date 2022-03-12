package linkedlist_work;

import java.util.*;

public class Maximum_Twin_Sum_of_a_Linked_List {
    /*
     * 
     * public static int findvalue(ListNode head,int ind, int p)
     * { ListNode t=head;
     * for(int i=0;i<p;i++)
     * {
     * if(i==ind)
     * {
     * return t.val;
     * }
     * t=t.next;
     * }
     * return -1;
     * }
     * public int pairSum(ListNode head) {
     * int p = 0;
     * ListNode temp = head;
     * while (temp != null) {
     * temp = temp.next;
     * p++;
     * }
     * temp=head;
     * int max=Integer.MIN_VALUE;
     * for(int i=0;i<p/2;i++)
     * {
     * int j=p-i-1;
     * int a=findvalue(head,i,p);
     * int b=findvalue(head,j,p);
     * 
     * max=Math.max(a+b, max);
     * 
     * 
     * }
     * 
     * return max;
     * 
     * }
     */

    public int pairSum(ListNode head) {
        // Stack<Integer> s = new Stack<>();
        // ListNode t = head;
        // while (t != null) {
        // s.push(t.val);
        // t = t.next;
        // }

        // int p = 0;
        // ListNode temp = head;
        // while (temp != null) {
        // temp = temp.next;
        // p++;
        // }
        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < p / 2; i++) {
        // int a = head.val + s.pop();
        // max = Math.max(max, a);

        // head = head.next;
        // }
        // return max;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        while (curr != null) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

        curr = head;
        int max = 0;
        // while(curr!=null)
        // {
        // System.out.println("c"+curr.val);
        // curr=curr.next;
        // }
        while (prev != null) {
            max = Math.max(curr.val + prev.val, max);
            prev = prev.next;
            curr = curr.next;
        }

        return max;
    }

}
