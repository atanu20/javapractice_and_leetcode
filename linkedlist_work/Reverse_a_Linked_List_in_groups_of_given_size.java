package linkedlist_work;

public class Reverse_a_Linked_List_in_groups_of_given_size {
    public static Node reverse(Node node, int k) {
        if (node == null)
            return null;
        Node prev = null;
        Node next = null;
        Node cur = node;
        int c = 0;
        while (c < k && cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            c++;
        }
        if (next != null)
            node.next = reverse(next, k);

        return prev;

    }

    // public ListNode reverseKGroup(ListNode node, int k) {
    // if(node==null)return null;
    // ListNode pre=null;
    // ListNode nex=null;
    // ListNode cur=node;
    // int i=0;
    // ListNode checkK=node;
    // while(checkK!=null){
    // checkK=checkK.next;
    // i++;
    // }
    // if(i<k) return node;
    // int c=0;
    // while(c<k && cur!=null)
    // {
    // nex=cur.next;
    // cur.next=pre;
    // pre=cur;
    // cur=nex;
    // c++;
    // }
    // if(nex!=null)
    // node.next=reverseKGroup(nex,k);

    // return pre;

    // }
}
