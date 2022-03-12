package linkedlist_work;

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s = new HashSet<>();
        while (headA != null) {
            s.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (s.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }
}
