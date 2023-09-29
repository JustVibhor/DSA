package Recursion.RecursionArrays;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.binarySearch;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};

        System.out.println(rotatedBSRecursion(nums, 0, 0, nums.length-1));
    }



    static int linearSearch(int[] nums, int target) {

        return helper(nums, target, 0);
    }

    static List<Integer> linearMultipleSearch(int[] nums, int target) {

        return helperSM(nums, target, 0);
    }

    private static List<Integer> helperSM(int[] nums, int target, int index) {
        List<Integer> list = new ArrayList<>();

        if (nums[index] == target) {
            list.add(index);
        }

        if (index == nums.length - 1) {
            return list;
        }

        list.addAll(helperSM(nums, target, index + 1));

        return list;

    }

    private static List<Integer> helperS(int[] nums, int target, int index, ArrayList<Integer> list) {

        if (index == nums.length) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }

        return helperS(nums, target, index + 1, list);


    }

    private static int helper(int[] nums, int target, int index) {

        if (index == nums.length) {
            return -1;
        }

        return nums[index] == target ? index : helper(nums, target, index + 1);
    }

    static int rotatedBSRecursion(int[] nums, int target, int start, int end) {

        if(start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if(nums[mid] == target) {
            return mid;
        }

        if(nums[mid] >= nums[start]) {
            if(nums[mid] >= target && nums[start] <= target) {
                return rotatedBSRecursion(nums, target, start, mid-1);
            } else {
                return rotatedBSRecursion(nums, target, mid+1, end);
            }
        }

        if(nums[mid] <= target && nums[end] >= target) {
            return rotatedBSRecursion(nums, target, mid+1, end);
        } else {
            return rotatedBSRecursion(nums, target, start, mid-1);
        }
    }

    static int rotatedBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = findPeak(nums);

        if(peak == -1) {
            return binarySearch(nums, target);
        }

        if(nums[peak] == target) {
            return peak;
        }

        if(nums[start] <= target) {
            return binarySearch(nums, target, start, peak-1);
        } else {
            return binarySearch(nums, target, peak+1, end);
        }
    }

    private static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid > start && nums[mid-1] > nums[mid]) {
                return mid-1;
            }
            if(nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;

    }

}
