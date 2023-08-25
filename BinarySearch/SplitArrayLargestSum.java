package BinarySearch;
// Google Ka Question
public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 3, 2};
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while(start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num:  nums) {
                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
        }


        return end;
    }



}
