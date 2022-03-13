package linkedlist_work;

public class Intersection_of_two_sorted_Linked_lists {
    public static Node findIntersection(Node headA, Node headB) {
        Node ans = new Node(0);
        Node res = ans;

        while (headA != null && headB != null) {
            if (headA.data == headB.data) {
                res.next = headA;
                res = res.next;

                headA = headA.next;
                headB = headB.next;

            } else if (headA.data < headB.data) {
                headA = headA.next;

            } else {

                headB = headB.next;
            }
        }

        return ans.next;
    }
}
