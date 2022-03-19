package linkedlist_work;

public class Given_a_linked_list_of_0s {
    static Node segregate(Node head) {
        // List<Integer> l=new ArrayList<>();
        // Node t=head;
        // while(t!=null)
        // {
        // l.add(t.data);
        // t=t.next;
        // }
        // Collections.sort(l);
        // Node ans=new Node(0);
        // Node dum=ans;
        // t=head;
        // int p=0;
        // while(t!=null)
        // {
        // dum.next=new Node(l.get(p));
        // dum=dum.next;
        // t=t.next;
        // p++;
        // }
        // return ans.next;

        Node temp = head;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            }
            if (temp.data == 1) {
                count1++;
            }
            if (temp.data == 2) {
                count2++;
            }
            temp = temp.next;
        }
        Node curr = head;
        while (count0-- > 0) {
            curr.data = 0;
            curr = curr.next;
        }
        while (count1-- > 0) {
            curr.data = 1;
            curr = curr.next;
        }
        while (count2-- > 0) {
            curr.data = 2;
            curr = curr.next;
        }

        return head;

    }
}
