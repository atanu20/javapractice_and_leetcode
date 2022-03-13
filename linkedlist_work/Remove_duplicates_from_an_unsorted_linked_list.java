package linkedlist_work;

public class Remove_duplicates_from_an_unsorted_linked_list {
    public Node removeDuplicates(Node head) {
        Set<Integer> s = new HashSet<>();

        Node t = head;
        s.add(t.data);

        while (t.next != null) {
            if (s.contains(t.next.data)) {
                t.next = t.next.next;

            } else {

                s.add(t.next.data);
                t = t.next;

            }

        }
        return head;
    }
}
