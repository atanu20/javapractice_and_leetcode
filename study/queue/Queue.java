package study.queue;

import java.util.List;

public class Queue {
    private ListNode rear;
    private ListNode front;
    private int size;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int a) {
            this.data = a;
        }
    }

    public int length()

    {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int a) {
        ListNode newdata = new ListNode(a);
        if (isEmpty()) {
            front = newdata;
            rear = newdata;

        } else {
            rear.next = newdata;
            rear = newdata;

        }
        size++;
    }

    public void pop() {

        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        size--;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        ListNode t = front;
        while (t != null) {
            System.out.print(t.data + "->");
            t = t.next;
        }

    }

    public int first() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }

    public int last() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return rear.data;
    }

    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.push(10);
        qu.push(20);
        qu.push(30);
        qu.push(88);

        // qu.pop();

        System.out.println(qu.first());
        System.out.println(qu.last());
        System.out.println(qu.length());
        qu.show();
    }
}
