package linkedlist_work;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();

        sl.insert(10);
        sl.insert(11);
        sl.insert(13);
        sl.insert(13);
        // sl.insert(13);
        // sl.insert(13);

        sl.insert(14);

        // sl.insertStart(5);

        // sl.insertAt(1, 9);

        // sl.insertAt(9, 500);
        // sl.insertAt(21, 20);

        // sl.delete(6);
        // sl.deleteFirst();
        // sl.deleteLast();
        // System.out.println(sl.search(501) == 1 ? "Find" : "Not Found");
        // sl.show();
        // sl.reverse();
        sl.show();
        // System.out.println(sl.midEle());
        // System.out.println(sl.nth_node_from_end(2));
        // System.out.println(sl.size());
        // sl.removeduplicate();
        sl.addElementInSortedOrder(1);
        sl.show();
    }
}
