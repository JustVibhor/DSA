package LinkedList.Questions.Question1And2;

import LinkedList.Questions.Question1And2.LL;

public class Main {
    public static void main(String[] args) {
        LL<Integer> list = new LL<>();

        for(int i=1; i<6; i++) {
            list.addLast(i);
        }

        list.display();
        list.insertUsingRecursion(3, 2);
        list.insertUsingRecursion(3, 3);
        list.display();
        list.deleteDuplicates();
        list.display();

    }
}
