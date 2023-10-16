package OOPs.Annotations;

public class Main implements A, B {

    public static void main(String[] args) {
        A.staticMethod();
    }

    @Override
    public void greet() {

    }
    // Internally is an interface using @interface
}
