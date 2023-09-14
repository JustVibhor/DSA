// Stable vs Unsatable Sorting Algo
// => When original order is maintained algo is a stable sorting algo, else its unstable.
// Ex: Suppose we have a black ball of number 5 and a red ball of number 5 and in original order black comes before red
// and after sorting the black ball still comes before red, Then that algo is a stable algo.



package Sorting;

import java.util.Arrays;

public class NormalSorting {

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 4, 2};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    // compare adjacent elements
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

    // find max and put it to the last
    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int lastIndex = nums.length - i - 1;
            int maxIndex = getMax(nums, 0, lastIndex);
            System.out.println(maxIndex);

            swap(nums, maxIndex, lastIndex);
        }
    }

    // sort in pieces
    static void insertionSort(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    // cycle sor for 1 -> N, example {5, 3, 1, 2, 4}
    static void cycleSort(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    private static int getMax(int[] nums, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }
        }

        return max;

    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
