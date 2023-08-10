package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 9, 11, 12, 18, 22, 34};

        System.out.println(binarySearch(nums, 5));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else return mid;
        }

        return -1;
    }

}
