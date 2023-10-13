package OOPs.PolyMorphism.CompileTime;

public class Main {
    public static void main(String[] args) {
        // this represents Compile time polymorphism also called Static Polymorphism
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
