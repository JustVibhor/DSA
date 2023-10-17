package OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomArrayList<Integer> list = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((i+'a'));
        }

        System.out.println(list.toString());
        System.out.println(list.size());
    }
}
