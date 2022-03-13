package linkedlist_work;

public class Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;

        ListNode curr = head, prev = null;
        Stack<ListNode> stack = new Stack<>();
        int i = 1;
        while (curr != null) {

            if (i >= left && i <= right) {
                stack.push(curr);
            } else {
                if (!stack.isEmpty())
                    break;
                prev = curr;
            }
            curr = curr.next;
            i++;
        }

        while (!stack.isEmpty()) {
            if (prev != null) {
                prev.next = stack.pop();
                prev = prev.next;
            } else {
                head = stack.peek();
                prev = stack.pop();
            }
        }

        if (prev != null) {
            prev.next = curr;
        } else {
            prev = curr;
        }

        return head;

    }
}
