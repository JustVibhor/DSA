package String;

public class StringFundamentals {
    public static void main(String[] args) {
        System.out.println('a' - 'b'); // gives int value i.e. adds binary value of 'a' and 'b'
        System.out.println("a" + "b"); // concatenates a and b in a string value
        System.out.println((char)('b' + 2)); // gives char value of 100 i.e 'd'
        System.out.println("a" + 1); // when int is concatenates with String it calls Integer instead of int

        // To Avoid the problem of creating new obj everytime we can use StringBuilder
        StringBuilder series = new StringBuilder();

        for(int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            series.append(ch);
        }
        System.out.println(series);
    }


}
