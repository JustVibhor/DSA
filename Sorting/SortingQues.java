package Sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingQues {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 3, 1};
        System.out.println(duplicateNumber(nums));

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
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) {
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

    public static int duplicateNumber(int[] nums) {
        int[] new_nums = Arrays.copyOf(nums, nums.length);

        cycleSort(new_nums);
        System.out.println(Arrays.toString(new_nums));
        for (int i = 0; i < new_nums.length; i++) {
            if(new_nums[i] != i+1) {
                return new_nums[i];
            }
        }

        return -1;
    }

}



