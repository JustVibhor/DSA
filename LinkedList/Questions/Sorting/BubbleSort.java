package LinkedList.Questions.Sorting;

import LinkedList.Questions.Question1And2.LL;

public class BubbleSort {

    private int size;
    private ListNode head;
    private ListNode tail;

    public BubbleSort() {
        this.size = 0;
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0) {
            return;
        }

        if(row > col) {
            ListNode first = getNode(col);
            ListNode second  = getNode(col+1);

            if(first.val > second.val) {
                swapNodes(first, second, col);
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row-1, 0);
        }
    }

    private void swapNodes(ListNode f, ListNode s, int col) {
        ListNode p = getNode(col-1);
        if(f == head) {
            head = s;
            f.next = s.next;
            s.next = f;
            return;
        }

        if(s == tail) {
            p.next = s;
            tail = f;
            f.next = null;
            s.next = f;
            return;
        }

        p.next = s;
        f.next = s.next;
        s.next = f;

    }



    public void addFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public ListNode getNode(int index) {
        ListNode node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        ListNode node = head;

        while (node != null) {
            System.out.print("[" + node.val + "] => ");
            node = node.next;
        }
        System.out.println("END");
    }


    private class ListNode {
        private ListNode next;
        private int val;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        BubbleSort list = new BubbleSort();
        for (int i=1; i<6; i++) {
            list.addFirst(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
