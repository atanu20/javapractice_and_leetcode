package study.stack;

import java.util.List;

public class Stack {
    private ListNode top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int a) {
        ListNode newdata = new ListNode(a);

        if (isEmpty()) {
            top = newdata;
        } else {
            newdata.next = top;
            top = newdata;
        }
        size++;

    }

    public void peek() {

        System.out.println(top.data);

    }

    public void pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        } else {
            top = top.next;
        }
        size--;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        ListNode t = top;
        while (t != null) {
            System.out.print(t.data + "->");
            t = t.next;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        // st.peek();
        st.pop();
        System.out.println(st.length());
        st.display();
    }
}
