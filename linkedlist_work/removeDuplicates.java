package linkedlist_work;

public class removeDuplicates {
    Node removeDuplicates(Node head) {
        Node t = head, first = null;

        while (t != null) {
            first = t;
            while (first.next != null && first.data == first.next.data) {
                first = first.next;
            }
            t.next = first.next;
            t = t.next;
        }
        return head;
    }
}
