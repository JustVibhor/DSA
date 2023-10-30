package StackAndQueue.Queue;

import java.util.Arrays;

public class CustomQueue<T> {

    private T[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = -1;
    private int start = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = (T[]) new Object[size];
    }

    public T push(T value) {
        if(isFull()) {
            resize();
        }

        return data[++end] = value;
    }

    public T pop() throws QueueException {
        if(isEmpty()) {
            throw new QueueException("Queue is Empty!!");
        }

        return data[++start];
    }

    public T popUsingKunalsMethod() throws QueueException {
        if(isEmptyForKunalsMethod()) {
            throw new QueueException("Queue is Empty!!");
        }

        T val = data[0];

        for(int i=1; i<end; i++) {
            data[i-1] = data[i];
        }

        return val;
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end == start;
    }

    public boolean isEmptyForKunalsMethod() {
        return end == start;
    }
}
