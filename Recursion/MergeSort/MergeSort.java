package Recursion.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        enhancedMergeSort(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static void enhancedMergeSort(int[] nums, int start, int end) {

        int mid = start + (end - start) / 2;

        if (end - start == 1) {
            return;
        }


        enhancedMergeSort(nums, start, mid);
        enhancedMergeSort(nums, mid, end);

        enhancedMerge(nums, start, mid, end);
    }

    static void enhancedMerge(int[] nums, int s, int m, int end) {
        int[] mix = new int[end - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < end) {
            if (nums[i] < nums[j]) {
                mix[k] = nums[i++];
            } else {
                mix[k] = nums[j++];
            }
            k++;
        }
        while (i < m) {
            mix[k++] = nums[i++];
        }

        while (j < end) {
            mix[k++] = nums[j++];
        }

        for(int l=0; l<mix.length; l++) {
            nums[s + l] = mix[l];
        }


    }


    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i++];
            } else {
                mix[k] = right[j++];
            }
            k++;
        }

        while (i < left.length) {
            mix[k++] = left[i++];
        }

        while (j < right.length) {
            mix[k++] = right[j++];
        }

        return mix;
    }

}
