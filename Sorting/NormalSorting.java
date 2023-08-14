package Sorting;

import java.util.Arrays;

public class NormalSorting {

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 3, 2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        boolean swapped = false;

        for(int i=0; i<nums.length; i++) {
            for(int j=1; j<nums.length-i; j++) {
                if(nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
