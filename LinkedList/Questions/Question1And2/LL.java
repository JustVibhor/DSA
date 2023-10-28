package LinkedList.Questions.Question1And2;

//Q1 Recursive insertion of LinkedList
//Q2 Remove Duplicates from Sorted List
//Q3 Merge Two Sorted Lists
//Q4 Reverse LinkedList
//Q5 Reverse LinkedList 2
//Q6 Palindrome Linked List
//Q7 Reorder Linked List
public class LL<T> {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
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

    // Q1
    public void insertUsingRecursion(T val, int index) {
        head = helper(val, index, head);
    }

    private Node helper(T val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = helper(val, index - 1, node.next);
        return node;
    }

    // Q2
    public void deleteDuplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
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
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node node = getNode(index - 1);
        T val = node.next.value;

        if (node.next.next == null) {
            node.next = null;
            return val;
        }

        node.next = node.next.next;
        return val;
    }

    public Node findNode(T val) {
        Node node = head;

        while (node != null) {
            if (val.equals(node.value)) {
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
        System.out.println("END");
    }


    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // Q-4
    Node inPlaceReversal(Node head) {
        Node prev = null;
        Node pres = head;
        Node future = pres.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = future;
            if (future != null) {
                future = future.next;
            }
        }

        return prev;
    }

    // Q-5
    Node revereBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        Node prev = null;
        Node current = head;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
        Node future = current.next;

        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = future;
            if (future != null) {
                future = future.next;
            }
        }

        if(last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;

        return head;
    }

    // Q-6
    public boolean palindrome(Node head) {
        Node mid = getMid(head);
        Node left = head;
        Node right = inPlaceReversal(mid);

        while(left != null && right != null) {

            if(left.value != right.value) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Q-7
    public void reorderList(Node head) {
        Node s = head;
        Node e = inPlaceReversal(getMid(head));
        Node ans = new Node();
        Node temp = ans;

        int count = 0;

        while(s != null && e != null) {
            if(count % 2 == 0) {
                temp.next = s;
                s = s.next;
            } else {
                temp.next = e;
                e = e.next;
            }
            temp = temp.next;
            count++;
        }
        head = ans;
    }

    public Node getMid(Node head) {
        Node s = head;
        Node f = head;

        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public static void main(String[] args) {
        LL<Integer> list = new LL<>();
        for (int i = 1; i < 6; i++) {
            list.addLast(i);
        }
        list.display();
        list.reverse(list.head);
        list.display();
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

        public Node() {

        }
    }
}
