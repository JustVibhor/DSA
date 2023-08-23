package BinarySearch;

public class CodeOutput {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 3, 2};
        arrPrint(arr);
    }

    static void arrPrint(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
