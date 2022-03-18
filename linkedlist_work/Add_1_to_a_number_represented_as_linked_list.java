package linkedlist_work;

public class Add_1_to_a_number_represented_as_linked_list {
    static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node next = null, cur = head, prev = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static Node addOne(Node head) {
        head = reverse(head);
        // Node t=head;
        // while(t!=null)
        // {
        // //System.out.print(t.data+" ");
        // t=t.next;
        // }
        int c = 0;
        Node res = new Node(0);
        Node dum = res;
        int p = 0;
        while (head != null) {
            int sum = 0;
            if (p == 0) {
                sum = head.data + 1 + c;
            } else {
                sum = head.data + c;
            }
            c = sum / 10;
            dum.next = new Node(sum % 10);
            dum = dum.next;
            head = head.next;
            p++;
        }
        if (c > 0) {
            dum.next = new Node(c);
            dum = dum.next;
        }
        Node ans = reverse(res.next);
        return ans;
        // return head;
    }
}
