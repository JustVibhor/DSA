package Recursion.RecursionArrays;


public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(nums));
    }

    static boolean isSorted(int[] nums) {

        return helper(nums, 0);
    }

    // draw the recursion tree
    private static boolean helper(int[] nums, int move) {
        if (move == nums.length - 1) {
            return true;
        }

        return nums[move] < nums[move+1] && helper(nums, move+1);
    }

}
