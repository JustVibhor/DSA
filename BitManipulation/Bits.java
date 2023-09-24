package BitManipulation;

import java.util.Arrays;

public class Bits {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        int n = findNonRepeatingElement(nums);
        System.out.println(n);

    }

    private static int covertBinaryToDecimal(int n) {
        int ans = 0;
        int count = 0;
        while(n > 0) {
            ans += (int) ((n % 10)*Math.pow(2, count));
            count++;
            n /= 10;
        }
        return ans;
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

        return n | (1 << i-1);
    }

    static int resetIthBit(int n, int i) {
        return (n >> i) << i;
    }

    static int findRightMostSetBit(int n) {
//        if(n == 0) {
//            return -1;
//        }
//        int count = 1;
//        while(true) {
//            if((n & 1) == 1) {
//                return count;
//            }
//            n = n >> 1;
//            count++;
//        }
        return n & -n;
    }

    // Repetition is in odd
    static int findNonRepeatingElement(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            int n = covertDecimalToBinary(num);
            ans += n;
//            System.out.println(ans);
        }
//        return ans;

        int real_ans = 0;
        int count = 0;

        while(ans > 0) {
            real_ans += (int) (((ans%10)%3)*Math.pow(10, count));
            count++;
            ans /= 10;

        }
        return covertBinaryToDecimal(real_ans);
    }

    static int covertDecimalToBinary(int n) {
        int ans = 0;
        int count = 0;
        while(n > 0) {
            ans += (int) ((n % 2)*Math.pow(10, count));
            n /= 2;
            count++;
        }

        return ans;

    }

}
