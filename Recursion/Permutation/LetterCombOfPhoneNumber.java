package Recursion.Permutation;

import java.util.ArrayList;
import java.util.List;

public class LetterCombOfPhoneNumber {
    public static void main(String[] args) {
        String[] phoneBook = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = letter("", "23", phoneBook);
        System.out.println(list);
    }

    static List<String> letter(String p, String up, String[] phoneBook) {
        List<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        String letters = phoneBook[up.charAt(0) - '2'];

        for (char letter : letters.toCharArray()) {
            list.addAll(letter(p + letter, up.substring(1), phoneBook));
        }


        return list;
    }
}
