package FileHandling;

import java.io.*;

public class InputStreamExample {

    static File file = new File("./FileHandling/readIt.txt");

    public static void main(String[] args) throws FileNotFoundException {
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

//        try (FileReader fileReader = new FileReader(file)) {
//            System.out.println("Enter some characters: ");
//            int letters = fileReader.read();
//            System.out.println(letters);
//
//            while (fileReader.ready()) {
//                System.out.println((char) letters);
//                letters = fileReader.read();
//            }
//
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


        // Output
//        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello");
//            osw.write(101);
//            osw.write("\n");
//            osw.write('A');
//            osw.write(new char[] {'a', 'b', 'c'});
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

        try (FileWriter fw = new FileWriter(file)) {
            fw.append("अहिंसा सत्यमक्रोधस्त्यागः शान्तिरपैशुनम्।\n" +
                    "दया भूतेष्वलोलुप्त्वं मार्दवं ह्रीरचापलम्");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // Create
        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if (fo.delete()) {
                System.out.println(fo.getName() + " is deleted");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
