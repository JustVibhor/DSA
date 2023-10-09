package Recursion.Permutation;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {
    public static void main(String[] args) {
        System.out.println(targetSum("", 4));
    }

    static List<String> targetSum(String p, int up) {
        List<String> list = new ArrayList<>();
        if(up == 0) {
            list.add(p);
            return list;
        }

        for(int i=1; i<=up; i++) {
            list.addAll(targetSum(p+i, up-i));
        }

        return list;
    }
}
