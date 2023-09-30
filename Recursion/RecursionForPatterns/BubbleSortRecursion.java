package Recursion.RecursionForPatterns;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 5, 3, 1, 6};
        bubbleSort(nums, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums, int r, int c) {

        if(r == 0) {
            return;
        }

        if(r > c) {
            if(nums[c] > nums[c+1]) {
                swap(nums, c, c+1);
            }
            bubbleSort(nums, r, c+1);
        } else {
            bubbleSort(nums, r-1, 0);
        }

    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
