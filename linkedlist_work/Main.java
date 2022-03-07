package linkedlist_work;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.insert(15);
        sl.insert(12);
        sl.insert(2);
        sl.insert(152);
        sl.insertStart(50);
        sl.insertStart(20);
        sl.insertAt(0, 19);
        sl.insertAt(2, 199);
        sl.insertAt(1, 9);

        sl.insertAt(9, 500);
        sl.insertAt(21, 20);
        sl.show();
        int n = sl.delete(199);
        System.out.println(n);
        System.out.println(sl.size());
    }
}
