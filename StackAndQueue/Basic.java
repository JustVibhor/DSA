package StackAndQueue;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Basic {

    // When do we use Stack and Queues?
    //      When need to store the answer for later use, also when converting recursive prog to iterative prog.


    public static void main(String[] args) {
        // Internally Stack is an array
        Stack<Integer> stack = new Stack<>();
        // Internally queue is a linked list
        Queue<Integer> queue = new LinkedList<>();
        // Deque, u can insert and remove from both the sides.
        // Faster than LinkedList and Stacks
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("For Stack");
        for(int i=1; i<6; i++) {
            System.out.print(i + "  ");
            stack.push(i);
        }
        System.out.println("End");

        while (!stack.isEmpty()) {
            // First In Last Out
            System.out.print(stack.pop() + "  ");
        }
        System.out.println("End of Utilizing stack\n");


        System.out.println("For Queue");
        for(int i=1; i<6; i++) {
            System.out.print(i + "  ");
            queue.add(i);
        }
        System.out.println("End");

        while (!queue.isEmpty()) {
            // First In First Out
            System.out.print(queue.remove() + "  ");
        }
        System.out.println("End of utilizing queue\n");

        System.out.println("For Deque");
        for(int i=1; i<7; i++) {
            System.out.print(i + "  ");
            deque.add(i);
        }
        System.out.println("End");
        while (!deque.isEmpty()) {
            System.out.print(deque.removeFirst() + " AND " + deque.removeLast() + "  ||  ");
        }
    }
}
