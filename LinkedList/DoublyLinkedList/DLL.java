package LinkedList.DoublyLinkedList;

public class DLL<T> {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void add(T value) {
        if (head == null) {
            addFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        node.next = null;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void addFirst(T value) {
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addAtIndex(T val, int index) {
        if (index == 0) {
            addFirst(val);
            return;
        }

        if (index == size) {
            add(val);
            return;
        }
        Node newNode = new Node(val);

        Node node = getNode(index - 1);

        newNode.next = node.next;
        node.next.prev = newNode;
        node.next = newNode;
        newNode.prev = node;
    }

    public T deleteLast() {
        if(size <= 1) {
            deleteFirst();
        }
        Node node = tail;
        tail = tail.prev;
        tail.prev = node.prev.prev;
        tail.next = null;
        return node.value;
    }

    public T deleteFirst() {
        T val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;

        return val;
    }

    public T deleteAtIndex(int index) {
        if(index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node node = getNode(index);
        T val = node.value;
        node.prev.next = node.next;
        node.next.prev = node.prev;

        return val;
    }


    public Node getNode(int index) {
        Node node = index < size / 2 ? head : tail;

        if (node == head) {
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
        } else {
            for (int i = 0; i < size - index - 1; i++) {
                node = node.prev;
            }
        }
        return node;
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