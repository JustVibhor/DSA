package StackAndQueue.Stack;

import java.util.Arrays;

public class CustomStack<T> {
    protected T[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = (T[]) new Object[size];
    }

    public T push(T value) {
        if (isFull()) {
            resize();
        }

        data[++ptr] = value;
        return value;
    }

    public T pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is EMPTY!!!");
        }

        return data[ptr--];
    }

    public T peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is EMPTY!!!");
        }

        return data[ptr];
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
