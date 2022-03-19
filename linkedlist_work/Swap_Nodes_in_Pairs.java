package linkedlist_work;

public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp = head;
        while (temp != null) {
            if (temp.next == null)
                return head;
            int t = temp.val;
            temp.val = temp.next.val;
            temp.next.val = t;

            temp = temp.next.next;
        }
        return head;

    }

    // public Node pairwiseSwap(Node head)
    // {
    // Node temp = new Node(0);
    // temp.next = head;
    // Node current = temp;

    // while(current.next != null && current.next.next != null){
    // Node first = current.next;
    // Node second = current.next.next;
    // first.next = second.next;
    // current.next = second;
    // current.next.next = first;
    // current = current.next.next;
    // }

    // return temp.next;

    // }
}
