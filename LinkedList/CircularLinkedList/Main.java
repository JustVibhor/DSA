package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL<Integer> list = new CLL<>();

        for (int i=0; i<5; i++) {
            list.add(i+1);
        }

        list.display();
        list.delete(2);

        list.display();
    }
}
