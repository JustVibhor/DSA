package Recursion.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {7, 5, 2};

        System.out.println(Arrays.toString(mergeSort(nums)));
    }

   static int[] mergeSort(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }

        int mid = nums.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
   }

   static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                mix[k] = left[i++];
            } else {
                mix[k] = right[j++];
            }
            k++;
        }

        while(i < left.length) {
            mix[k++] = left[i++];
        }

        while(j < right.length) {
            mix[k++] = right[j++];
        }

        return mix;
   }

}
