package LinkedList.Basics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Float> list = new LinkedList<>();

        list.addFirst(3.0f);
        list.addFirst(2f);
        list.addFirst(1f);
        list.addLast(4f);
        list.addLast(6f);
        list.addAtIndex(5f, 4);
        list.addAtIndex(4.5f, 4);
//        list.display();

        System.out.println(list.findNode(2f));
    }
}
