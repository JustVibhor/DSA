package OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//<T> represents type
// extends Number here represents wildcard i.e. this arraylist will only take numbers ( Number or its subclasses)
public class CustomArrayList<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }

        data[size++] = num;

    }

    public Object remove() {
        return data[size--];
    }

    public Object get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    private boolean isFull() {
        return size == data.length;
    }


}
