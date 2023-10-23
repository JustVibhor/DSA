package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();

        list.add(8);
        list.add(2);
        list.add(5);
        list.add(7);

        list.display();
        list.addAtIndex(23, 1);
        list.display();

    }
}