package LinkedList.CircularLinkedList;

public class CLL<T> {

    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size = 0;
    }

    public void add(T val) {
        Node node = new Node(val);

        if (head == null) {
            addFirst(val);
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void addFirst(T val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;

    }

    public void delete(int val) {
        Node node = head;
        Node temp = head;

        if(node == null) {
            return;
        }

        if(node.value.equals(val)) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            if(node.value.equals(val)) {
                temp.next = node.next;
            }
            temp = node;
            node = node.next;
        } while (node != head);
    }

    public void display() {
        Node node = head;

        if(head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println("Head");
        }
    }

    class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
