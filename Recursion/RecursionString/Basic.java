package Recursion.RecursionString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basic {
    public static void main(String[] args) {

        // System.out.println(skipApple("somethingAppleNothing"));
        List<String> list = new ArrayList<>();
        System.out.println(subSetsListBody("abc", ""));
        ;

    }


    static void subSets(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        subSets(str.substring(1), ans + str.charAt(0));
        subSets(str.substring(1), ans);
    }

    static List<String> subSetsListArgs(String str, String ans, List<String> list) {
        if (str.isEmpty()) {
            list.add(Objects.equals(ans, "") ? "null" : ans);
            return list;
        }

        subSetsListArgs(str.substring(1), ans + str.charAt(0), list);
        subSetsListArgs(str.substring(1), ans, list);

        return list;
    }

    static List<String> subSetsListBody(String str, String ans) {
        List<String> list = new ArrayList<>();

        if(str.isEmpty()) {
            list.add(Objects.equals(ans, "") ? "null" : ans);
            return list;
        }

        list.addAll(subSetsListBody(str.substring(1), ans+str.charAt(0)));
        list.addAll(subSetsListBody(str.substring(1), ans));

        return list;
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
