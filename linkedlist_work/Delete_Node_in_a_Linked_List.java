package linkedlist_work;

public class Delete_Node_in_a_Linked_List {
    public void deleteNode(ListNode node) {

        ListNode previous = node;
        while (node != null && node.next != null) {
            previous = node;
            node.val = node.next.val;
            node = node.next;
        }
        previous.next = null;
    }
}
