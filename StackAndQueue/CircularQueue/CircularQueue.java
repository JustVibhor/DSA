package StackAndQueue.CircularQueue;

import java.util.Arrays;

public class CircularQueue<T> {
    protected T[] data;
    protected int size = 0;
    protected static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;

    public CircularQueue() {
    }

    public CircularQueue(int size) {
        this.data = (T[]) new Object[size];
    }

    public T push(T value) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is FULL!!");
        }

        data[end++] = value;
        end = end % data.length;
        size++;
        return value;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is EMPTY!!!");
        }

        T value = data[front++];
        front = front % data.length;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == end;
    }
}
