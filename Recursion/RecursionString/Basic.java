package Recursion.RecursionString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basic {
    public static void main(String[] args) {

        // System.out.println(skipApple("somethingAppleNothing"));
        System.out.println(subSetsIteration(new int[]{1, 2, 2, 2}));


    }

    // TC: O(N*2^N)
    // SC: O(2^N * N)
    static List<List<Integer>> subSetsIteration(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for (int num = 0; num < nums.length; num++) {
            start = 0;
            if (num > 0 && nums[num - 1] == nums[num]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums[num]);
                outer.add(inner);
            }
        }

        return outer;
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

        if (str.isEmpty()) {
            list.add(Objects.equals(ans, "") ? "null" : ans);
            return list;
        }

        list.addAll(subSetsListBody(str.substring(1), ans + str.charAt(0)));
        list.addAll(subSetsListBody(str.substring(1), ans));

        return list;
    }

    static List<String> subSetsListBodyAscii(String str, String ans) {
        List<String> list = new ArrayList<>();

        if (str.isEmpty()) {
            list.add(Objects.equals(ans, "") ? "null" : ans);
            return list;
        }

        list.addAll(subSetsListBodyAscii(str.substring(1), ans + str.charAt(0)));
        list.addAll(subSetsListBodyAscii(str.substring(1), ans + " " + (int) str.charAt(0)));
        list.addAll(subSetsListBodyAscii(str.substring(1), ans));

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
