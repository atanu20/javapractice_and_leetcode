package linkedlist_work;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();

        sl.insert(2);
        sl.insert(152);
        sl.insertStart(50);

        sl.insertAt(1, 9);

        sl.insertAt(9, 500);
        sl.insertAt(21, 20);

        // sl.delete(6);
        // sl.deleteFirst();
        // sl.deleteLast();
        // System.out.println(sl.search(501) == 1 ? "Find" : "Not Found");
        sl.show();
        sl.reverse();
        sl.show();
        System.out.println(sl.size());
    }
}
