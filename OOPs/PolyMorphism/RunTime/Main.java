package OOPs.PolyMorphism.RunTime;

import OOPs.PolyMorphism.Circle;
import OOPs.PolyMorphism.Shapes;

public class Main {

    public static void main(String[] args) {
        // This represents Runtime polymorphism also called Dynamic Polymorphism
        // Circle area() is overriding the Shapes area() also called method overriding

        // This Parent obj = new Child() is also called Upcasting

        // How java determines?
        // Java determines this at runtime also called Dynamic Method Dispatch

        // If we declare this method final, it cannot be overridden thus func is resolved at compile,
        // That's what we call Early Binding

        // And if not final an overridden func is resolved at runtime.
        // That's what we call Late Binding

        // Static Method cannot be overridden
        Shapes shape = new Circle();
        shape.area();
    }

}
