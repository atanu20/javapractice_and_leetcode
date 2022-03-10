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

    public void delete(int pos) {

        if (head == null)
            return;

        if (pos == 0) {

            head = head.next;

        } else if (pos == size()) {
            Node temp = head;
            Node n1 = null;

            while (temp.next != null) {
                n1 = temp;
                temp = temp.next;

            }
            n1.next = null;

        } else {

            Node temp = head;
            Node n1 = null;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            n1 = temp.next;
            temp.next = n1.next;

            n1 = null;

        }

    }

    public void deleteFirst() {
        if (head == null)
            return;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null)
            return;

        Node temp = head;
        Node n1 = null;
        while (temp.next != null) {
            n1 = temp;
            temp = temp.next;
        }
        n1.next = null;

    }

    public int search(int val) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == val) {
                return 1;
            }
            temp = temp.next;
        }
        if (temp.data == val) {
            return 1;
        }
        return 0;
    }

    public void reverse() {
        Node prev = null;
        Node next = null;
        Node temp = head;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;

    }

    public int midEle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow.data;

    }

    public int nth_node_from_end(int val) {
        int d = size() - val;
        Node n = head;
        // System.out.println(d);
        for (int i = 0; i < d; i++) {
            n = n.next;
        }
        return n.data;
    }

    public void removeduplicate() {
        Node n = head;
        while (n != null && n.next != null) {
            if (n.data == n.next.data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }

    }

    // public void loop() {
    // Node n = head;
    // int p = 0;
    // while (n.next != null) {
    // if (p == 2) {
    // break;
    // }
    // n = n.next;
    // p++;
    // }
    // System.out.println(n.data);
    // Node no = head;
    // while (no.next != null) {
    // no = no.next;
    // }
    // no.next = n;
    // }
    public void addElementInSortedOrder(int val) {
        Node nw = new Node();
        nw.next = null;
        nw.data = val;

        Node n = head;
        Node temp = null;
        int p = 0;
        while (n.next != null && n.data <= nw.data) {
            temp = n;
            n = n.next;
            p++;
        }
        if (p > 0) {
            nw.next = n;
            temp.next = nw;
        } else {
            insertStart(val);
        }

    }
}
