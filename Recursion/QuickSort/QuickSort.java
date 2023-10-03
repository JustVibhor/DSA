package Recursion.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {9, 1, 2, 5, 6};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }



    /*

    Quick Sort:
        Not a stable alg
        Better for linked list due to memory allocation (not continuous memory allocation)
        what its doing?
            Choose any element as pivot
            all elements < pivot will on the lhs and > pivot on rhs of pivot
            pivot will be at the correct position after each pass

        How to pick pivot?

     */

    /*
    Hybrid sorting algorithm
        Tim Sort Alg
            Uses merge sort + insertion sort (as insertion works really well with partially sorted data)
     */

    public static void quickSort(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int pivot = start + (end - start)/2;

        while(start <= end) {
            while (nums[start] < nums[pivot]) {
                start++;
            }
            while(nums[end] > nums[pivot]) {
                end--;
            }

            if(start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}
