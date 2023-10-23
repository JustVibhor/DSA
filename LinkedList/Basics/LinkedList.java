package LinkedList.Basics;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    //    O(1)
    public void addFirst(T value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    //    O(1)
    public void addLast(T value) {
        Node node = new Node(value);

        if (tail == null) {
            addFirst(value);
            return;
        }
        tail.next = node;
        tail = node;

        size++;
    }


    //    O(index-1)
    public void addAtIndex(T value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = new Node(value, temp.next);

        size++;
    }

    //    O(1)
    public T deleteFirst() {
        T val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;

        return val;
    }

//    O(N)
    public T deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }

        Node node = getNode(size - 2);
        T val = tail.value;

        tail = node;
        tail.next = null;
        size--;

        return val;
    }

    public T deleteAtIndex(int index) {
        if(index == 0) {
            return deleteFirst();
        }

        if(index == size-1) {
            return deleteLast();
        }

        Node node = getNode(index-1);
        T val = node.next.value;

        if(node.next.next == null) {
            node.next = null;
            return val;
        }

        node.next = node.next.next;
        return val;
    }

    public Node findNode(T val) {
        Node node = head;

        while(node != null) {
            if(val.equals(node.value)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node getNode(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        return size;
    }

    //    O(N)
    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print("[" + node.value + "] => ");
            node = node.next;
        }
        System.out.print("null");
    }

    private class Node {
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
