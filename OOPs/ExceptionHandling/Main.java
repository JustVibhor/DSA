package OOPs.ExceptionHandling;

import java.io.FileNotFoundException;

public class Main {
//    Object
//    Throwable
//     are of 2 types
//    1. Exception
//    2. Error

//    Exception are of 2 types
//    1. Checked (Compile Time exception) Ex: FileNotFoundException
//    2. Unchecked Exception (RunTime Exception) Ex: ArithmeticException

    public static void main(String[] args) {
        int a = 5;
        int b = 0;


        try {
            System.out.println(divide(a, b));
            String name = "Bhokaal";
            if (name.equals("Bhokaal")) {
                throw new MyCustomException("Bruh what the helll");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }

    private static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Do Not divide by zero");
        }

        return a / b;
    }
}
