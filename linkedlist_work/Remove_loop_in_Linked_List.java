package linkedlist_work;

import java.util.*;

public class Remove_loop_in_Linked_List {
    public static void removeLoop(Node head) {
        Set<Node> s = new HashSet<Node>();
        Node t = null;

        while (head != null) {

            if (s.contains(head)) {
                t.next = null;
                return;
            } else {
                s.add(head);
                t = head;
                head = head.next;
            }
        }
    }
}
