package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamExample {

    static File file = new File("./FileHandling/readIt.txt");

    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter some characters: ");
//            int letters = isr.read();
//            System.out.println(letters);
//
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

        try (FileReader fileReader = new FileReader(file)) {
            System.out.println("Enter some characters: ");
            int letters = fileReader.read();
            System.out.println(letters);

            while (fileReader.ready()) {
                System.out.println((char) letters);
                letters = fileReader.read();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
