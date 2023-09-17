package Sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingQues {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));

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

    // find all duplicate elements

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        cycleSort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                list.add(nums[i]);
            }
        }

        return list;
    }

    // set mismatch
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        cycleSort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }

        return ans;
    }

    // first Missing Positive
    public static int firstMissingPositive(int[] nums) {
        cycleSort(nums);
        if(nums[0] > nums.length) {
            return 1;
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }

        return nums.length+1;
    }

}



