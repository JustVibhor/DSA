package OOPs.Basics;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 39;
        Integer num2 = 50;
        // Wrapper class are final can't swap
        // final => make constant, can't modify the variable
        // final needs to be initialized while declaring
        swap(num, num2);

        System.out.println(num + " " + num2);

//        final int c = 3;
        // cant modify c
//        c = 5;

        // cannot reassign the reference variable, value can be updated
        final List<Integer> list = new ArrayList<>();
        // allowed
        list.add(5);
        // not allowed
//        list = new ArrayList<>();
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
