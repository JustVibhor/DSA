package LinkedList.DoublyLinkedList;

public class DLL<T> {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void addFirst(T value) {
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void add(T value) {
        if (tail == null) {
            addFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print("[" + node.value + "] -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void displayReverse() {
        Node node = tail;

        while (node != null) {
            System.out.print("[" + node.value + "] -> ");
            node = node.prev;
        }
        System.out.println("End");
    }

    class Node {
        private T value;
        private Node next;
        private Node prev;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}