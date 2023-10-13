package OOPs.PolyMorphism;

public class Main {
    public static void main(String[] args) {
        // Representing same thing in multiple ways
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes triangle = new Triangle();

        square.area();
    }
}
