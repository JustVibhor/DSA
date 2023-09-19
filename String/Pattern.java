package String;

public class Pattern {
    public static void main(String[] args) {
        System.out.println(palindrome("aabaaa"));
    }

    // Palindrome
    public static boolean palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start != end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
