package OOPs.Annotations;

public interface A {
    static void staticMethod() {
        System.out.println("This need a body, not dependent on object");
    }

    // why even use default in an interface?
    //      To expand the interfaces without breaking the existing code.
    default void fun() {
        System.out.println("Its A");
    }
}
