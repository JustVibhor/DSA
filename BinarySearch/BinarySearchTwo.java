package BinarySearch;

import java.util.Arrays;

public class BinarySearchTwo {

    public static void main(String[] args) {
        int[] nums = { 15, 18, 2, 3, 6, 12 };

//        System.out.println(Arrays.toString());
//        System.out.println(findKthInRotatedArray(nums)+1);
        }

    static int findKthInRotatedArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }

            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
