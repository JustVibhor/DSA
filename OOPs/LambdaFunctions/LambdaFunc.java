package OOPs.LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaFunc {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        Consumer<Integer> fun = (item) -> System.out.println(item * 10);

        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunc obj = new LambdaFunc();
        System.out.println(obj.operate(1, 2, sum));
        System.out.println(obj.operate(4, 3, prod));
        System.out.println(obj.operate(5, 3, sub));


    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }


}

interface Operation {
    int operation(int a, int b);
}
