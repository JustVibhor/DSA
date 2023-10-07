package Recursion.Permutation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<String> list = permutationBody("abc", "");
        System.out.println(list);
        System.out.println(list.size());

        
    }

    static List<String> permutationBody(String up, String p) {
        List<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            list.addAll(permutationBody(up.substring(1), p.substring(0, i) + c + p.substring(i)));
        }

        return list;
    }

    static List<String> permutationArgs(String up, String p, List<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            permutationArgs(up.substring(1), p.substring(0, i) + c + p.substring(i), list);
        }

        return list;
    }

    static void permutationVoid(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            permutationVoid(up.substring(1), p.substring(0, i) + c + p.substring(i));
        }

    }
}
