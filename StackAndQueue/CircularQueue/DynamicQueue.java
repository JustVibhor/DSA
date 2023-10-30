package StackAndQueue.CircularQueue;

import java.util.Arrays;

public class DynamicQueue<T> extends CircularQueue<T> {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public T push(T value) throws Exception {
        if (this.isFull()) {
            T[] temp = (T[]) new Object[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
        }

        return super.push(value);
    }
}
