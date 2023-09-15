package Sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingQues {
    public static void main(String[] args) {
        int[] nums = {4, 3, 0, 1};
        System.out.println(missingNumber(nums));

    }

    // find missing number 0 -> N
    static public int missingNumber(int[] nums) {
        cycleSort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;

    }

    static void cycleSort(int[] nums) {
        int i=0;

        while(i < nums.length) {
            int correct = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
    }
    // find all missing number 1 -> N
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        cycleSort(nums);

        System.out.println(Arrays.toString(nums));

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                list.add(i+1);
            }
        }

        return list;
    }

}



