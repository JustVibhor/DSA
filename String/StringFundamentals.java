package String;

public class StringFundamentals {
    public static void main(String[] args) {
        System.out.println('a' - 'b'); // gives int value i.e. adds binary value of 'a' and 'b'
        System.out.println("a" + "b"); // concatenates a and b in a string value
        System.out.println((char)('b' + 2)); // gives char value of 100 i.e 'd'
        System.out.println("a" + 1); // when int is concatenates with String it calls Integer instead of int

        // String Performance Issue
        // problem with this approach is
        // everytime series += ch happens a new String object is created which reduces its perfomance
        // So n loop Tc comes out to be O(n**2)
        String series = "";

        for(int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);
    }
}
