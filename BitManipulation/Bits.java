package BitManipulation;

import java.util.Arrays;

public class Bits {
    public static void main(String[] args) {
//        int[] nums = {2, 3, 4, 1, 2, 1, 3, 6, 4, 6, 9};
//        System.out.println(whichElementRepeating(nums));
        System.out.println(findIthBit(15, 2));
    }

    static String isEven(int n) {
        return (n&1) == 0 ? n + " is a even number" : n + " is an odd number";
    }

    static int whichElementRepeating(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    static int findIthBit(int n, int i) {

        return (n >> i-1) & 1;
    }

}
