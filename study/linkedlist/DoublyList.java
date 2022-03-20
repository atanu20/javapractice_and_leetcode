package study.linkedlist;

public class DoublyList {
    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode {
        private int data;
        private ListNode prev;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

    }

    public DoublyList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertEnd(int a) {
        ListNode newNode = new ListNode(a);
        if (isEmpty()) {
            head = newNode;
        } else {

            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void insertBig(int a) {
        ListNode newNode = new ListNode(a);
        if (isEmpty()) {
            tail = newNode;

        } else {

            head.prev = newNode;

        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertBefore(ListNode n, int data) {
        ListNode newNode = new ListNode(data);
        if (n == null || isEmpty()) {
            System.err.println("Something wrong");
            return;
        }
        if (n.prev != null) {
            n.prev.next = newNode;
        } else {
            head = newNode;
        }

        newNode.prev = n.prev;
        newNode.next = n;
        n.prev = newNode;
        size++;

    }

    public void InsertAfter(ListNode n, int data) {
        ListNode newNode = new ListNode(data);
        if (n == null || isEmpty()) {
            System.err.println("Something wrong");
            return;
        }

        newNode.next = n.next;
        if (n.next != null) {
            n.next.prev = newNode;
        } else {
            tail = newNode;
        }

        n.next = newNode;
        newNode.prev = n;
        size++;
    }

    public void displayFord() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
    }

    public void displayBack() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;

        }
    }

    public void delete(ListNode n) {
        if (isEmpty() || n == null) {
            System.out.println("List is empty or something wrong");
            return;
        }

        if (head == n) {
            head = head.next;
            size--;
            return;
        }

        n.prev.next = n.next;
        if (n.next != null) {
            n.next.prev = n.prev;
        } else {
            tail.prev.next = null;
        }

        size--;

    }

    public void deletefirst() {
        if (isEmpty()) {
            System.out.println("List is empty or something wrong");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty or something wrong");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        tail.prev.next = null;

        size--;
    }

    public void sortList() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }
        ListNode cur = head;
        ListNode ind = null;

        while (cur.next != null) {
            ind = cur.next;
            while (ind != null) {
                // increasing order
                if (cur.data > ind.data) {
                    int temp = cur.data;
                    cur.data = ind.data;
                    ind.data = temp;

                }
                ind = ind.next;
            }

            cur = cur.next;
        }

    }

    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        // dl.insertEnd(10);
        // dl.insertEnd(20);
        // dl.insertEnd(30);

        dl.insertEnd(7);
        dl.insertEnd(1);
        dl.insertEnd(4);
        dl.insertEnd(5);
        dl.insertEnd(2);

        // dl.insertBig(1);
        // dl.insertBig(3);
        // dl.insertBefore(dl.head, 55);
        // dl.insertBefore(dl.head.next.next.next, 78);
        // dl.InsertAfter(dl.head.next, 49);
        // dl.InsertAfter(dl.head.next.next.next, 9);

        // dl.insertBig(5);
        // dl.insertBig(1);
        // dl.insertBig(3);
        // dl.insertBig(5);

        // dl.delete(dl.head);
        // dl.delete(dl.head.next.next);

        // dl.deletefirst();
        // dl.deleteLast();
        dl.sortList();
        System.out.println(dl.length());
        dl.displayFord();
        // dl.displayBack();
    }
}
