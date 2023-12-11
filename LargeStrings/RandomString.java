package LargeStrings;

public class RandomString {
    static StringBuffer generate(int size) {
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i < size; i++) {
            sb.append((char) (97 + Math.floor(Math.random() * 26)));
        }

        return sb;
    }

    public static void main(String[] args) {
        System.out.println(generate(150));


    }
}