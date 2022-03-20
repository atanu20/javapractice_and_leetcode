package study.linkedlist;

public class CircularLinkedList {
    private ListNode last;
    private ListNode first;
    private int size;

    public CircularLinkedList() {
        this.last = null;
        this.first = null;
        this.size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int a) {
            this.data = a;
        }
    }

    public void insertLast(int a) {
        ListNode newdata = new ListNode(a);
        if (isEmpty()) {
            first = newdata;
            // newdata.next = first;
            // last = newdata;

        } else {
            last.next = newdata;
            // newdata.next = first;
            // last = newdata;
        }
        newdata.next = first;
        last = newdata;
        size++;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("list empty");
            return;
        }
        ListNode t = first;
        while (t != last) {
            System.out.print(t.data + "->");
            t = t.next;
        }
        System.out.print(t.data);
    }

    public void insertFirst(int data) {
        ListNode newdata = new ListNode(data);
        if (isEmpty()) {
            first = newdata;
            newdata.next = first;
            last = newdata;

        } else {
            last.next = newdata;
            newdata.next = first;
            first = newdata;
        }

        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        if (first == last) {
            first = null;
            last = null;
        } else {

            last.next = first.next;
            first = first.next;

        }
        size--;

    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        if (first == last) {
            first = null;
            last = null;
        } else {

            ListNode t = first;

            while (t.next != last) {
                t = t.next;
            }
            t.next = first;
            last = t;

        }

        size--;
    }

    public static void main(String[] args) {
        CircularLinkedList csl = new CircularLinkedList();
        csl.insertLast(10);
        csl.insertLast(20);
        csl.insertLast(30);
        csl.insertFirst(5);
        csl.insertLast(88);
        // csl.removeFirst();
        csl.removeLast();
        System.out.println(csl.length());
        csl.show();

    }
}
