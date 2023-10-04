package Recursion.RecursionString;

public class Basic {
    public static void main(String[] args) {

        System.out.println(skipApple("somethingAppleNothing"));

    }


    static String aRemoval(String str) {
        String ans = "";

        if (str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);

        if (ch != 'a') {
            ans = ch + aRemoval(str.substring(1));
        } else {
            ans = aRemoval(str.substring(1));
        }

        return ans;
    }


    static String skipApple(String str) {
        String ans = "";

        if (str.isEmpty()) {
            return ans;
        }
        char ch = str.charAt(0);
        if (str.toLowerCase().startsWith("apple")) {
            ans = skipApple(str.substring(5));
        } else {
            ans = ch + skipApple(str.substring(1));
        }

        return ans;
    }
}
