package JavaConcurency.Synchronization;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public synchronized boolean push(int element) {
        if (isFull()) {
            return false;
        }

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        array[++stackTop] = element;
        return true;
    }

    public synchronized int pop() {
        if (isEmpty()) {
            return -1;
        }

        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        stackTop--;
        return obj;
    }


    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }
}
