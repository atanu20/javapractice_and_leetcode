package linkedlist_work;

public class SingleLinkedList {
    private class Node {
        private int data;
        private Node next;
    }

    private Node head;

    public void insert(int val) {
        Node n = new Node();
        n.data = val;
        n.next = null;

        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;

        }

    }

    public void show() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " -> Null");
    }

    public void insertStart(int val) {
        Node n = new Node();
        n.data = val;
        n.next = null;

        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public int size() {
        int p = 0;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            p++;
        }

        return p + 1;

    }

    public void insertAt(int pos, int val) {
        Node n = new Node();
        n.data = val;
        n.next = null;

        int p = 0;

        if (pos == 0)
            insertStart(val);
        else if (pos == size()) {
            insertLast(val);
        } else if (pos > size()) {
            insertLast(val);
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (p == pos - 1) {
                    n.next = temp.next;
                    temp.next = n;
                } else {
                    temp = temp.next;
                }

                p++;
            }
        }
    }

    public void insertLast(int val) {
        Node n = new Node();
        n.data = val;
        n.next = null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = n;
        n.next = null;

    }

    public int delete(int val) {
        Node temp = head;
        while (temp.next != null) {

            if (temp.data == val) {

            }

            temp = temp.next;
        }
        return 1;
    }
}
