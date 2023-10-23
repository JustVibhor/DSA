package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();

        for(int i=0; i<5; i++) {
            list.add(i+1);
        }
        list.display();
        list.displayReverse();
    }
}