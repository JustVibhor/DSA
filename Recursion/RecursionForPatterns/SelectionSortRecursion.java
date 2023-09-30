package Recursion.RecursionForPatterns;

import java.util.Arrays;

import static Recursion.RecursionForPatterns.BubbleSortRecursion.swap;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 3, 1, 6};
        selectionSort(nums, nums.length - 1, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (nums[c] > nums[max]) {
            max = c;
        }
        if (r > c) {
            selectionSort(nums, r, c + 1, max);
        } else {
            swap(nums, max, c);
            selectionSort(nums, r - 1, 0, 0);
        }
    }
}
