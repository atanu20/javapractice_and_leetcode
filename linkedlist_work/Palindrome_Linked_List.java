package linkedlist_work;

public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode t = head;
        while (t != null) {
            s.push(t.val);
            t = t.next;
        }
        while (!s.isEmpty()) {
            if (head.val != s.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;

    }
}
