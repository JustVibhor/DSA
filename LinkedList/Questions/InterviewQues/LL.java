package LinkedList.Questions.InterviewQues;

// Q-3 Merge two sorted linked list
// Q-4 Linked List Cycle length
// Q-5 Linked List cycle, where it begins?
// Q-6 Happy Numbers

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    // Q-3
    public Node merge(Node f, Node s) {
        Node dummyHead = new Node();
        Node tail = dummyHead;

        while (f != null && s != null) {
            if (f.value > s.value) {
                tail.next = s;
                s = s.next;
                tail = tail.next;
            } else {
                tail.next = f;
                f = f.next;
                tail = tail.next;
            }
        }

        tail.next = f != null ? f : s;

        return tail;

    }

    // Q-4
    public int hasCycle() {
        Node s = head;
        Node f = head;

        while (f.next != null) {
            s = s.next;
            f = f.next.next;

            if (s == f) {
                int count = 0;

                do {
                    s = s.next;
                    count++;
                } while (f != s);
                return count;
            }
        }

        return 0;
    }

    // Q-5
    public Node detectCycle() {
        Node f = head;
        Node s = head;
        int length = hasCycle();

        if (length == 0) {
            return null;
        }

        for (int i = 0; i < length; i++) {
            s = s.next;
        }

        while (s != f) {
            s = s.next;
            f = f.next;
        }

        return f;
    }

    // Q-6
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSq(slow);
            fast = findSq(findSq(fast));

            if (slow == 1) {
                return true;
            }
        } while (fast != slow);
        return false;
    }

    private static int findSq(int n) {
        int sum = 0;

        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }

    public Node sort(Node node) {
        if(node == null || node.next == null) {
            return node;
        }

        Node mid = getMid(node);
        Node left = sort(head);
        Node right = sort(mid);

        return merge(left, right);

    }

    private Node getMid(Node node) {
        Node midPrev = null;

        while (node != null && node.next != null) {
            midPrev = (midPrev == null) ? node : midPrev.next;
            node = node.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }


    public static void main(String[] args) {
//        LL first = new LL();
//        first.insertLast(1);
//        first.insertLast(2);
//        first.insertLast(4);
//
//        LL second = new LL();
//        second.insertLast(1);
//        second.insertLast(3);
//        second.insertLast(4);
//
//        LL ans = merge(first, second);
//        first.display();
//        second.display();
//        ans.display();

    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }
    }
}
