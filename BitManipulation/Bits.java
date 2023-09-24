package BitManipulation;

import java.util.Arrays;

public class Bits {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(whichElementRepeating(nums));
    }

    static String isEven(int n) {
        return (n&1) == 0 ? n + " is a even number" : n + " is an odd number";
    }

    static int whichElementRepeating(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++) {
            int j;

            for(j=0; j<n; j++) {
                if(i != j && nums[i] == nums[j]) {
                    break;
                }
            }

            if(j == n) {
                return nums[i];
            }
        }
        return -1;
    }

}
