package OOPs.AbstractClass;

// Any class with >= 1 abstract method must be abstract class
public abstract class AbstractClass {
    int a;
    int b;

    AbstractClass() {
        this.a = -1;
        this.b = -1;
    }

    AbstractClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static String name(String name) {
        return name;
    }

    abstract void career(String name);

    abstract int sum(int a, int b);
}
