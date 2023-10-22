package OOPs.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumsBasic{
    enum Week implements A {
        // enum constants
        // public, static and final
        // All enum constant extends java.lang.Enum
        // Enum cannot extend classes but can implements as many interfaces as you want
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // Enum Constructor is not public or protected
        // Why?
        // As we don't want to create new objects
        Week() {
            System.out.println("Constructor for " + this.toString());
        }

        @Override
        public void display() {
            System.out.println("Yeah enum can implement interface");
        }
    }

    public static void main(String[] args) {
        Week w = Week.Monday;


    }
}
