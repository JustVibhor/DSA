package OOPs.EncapsulationAndAbstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    private void encapsulation() {
        // Protecting the information from the outside world, by using getters and setters
        // This is called encapsulation
        // Implementation Issue
        System.out.println("Wrapping up the implementation of the data members and methods in a  class");
    }

    public void abstraction() {
        // These are also called abstract data types, since we using them but don't know the implementation
        // Example for abstraction
        // This a design issue (I need a car, i don't know what engineering happening inside it)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.get(0) + "Hiding unnecessary details and showing valuable information ");
    }
}
