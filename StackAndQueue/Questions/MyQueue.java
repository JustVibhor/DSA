package StackAndQueue.Questions;

import java.util.Stack;

// Q-1
// Implement Queue using Stacks
public class MyQueue {

    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty())  {
            second.push(first.pop());
        }
        int val = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return val;
    }

    public int peek() {
        while(!first.isEmpty())  {
            second.push(first.pop());
        }
        int val = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return val;
    }

    public boolean empty() {
        return first.isEmpty();
    }


}
