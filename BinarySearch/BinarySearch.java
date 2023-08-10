package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 9, 11, 12, 18, 22, 34};
        char[] letters = {'c', 'f', 'j'};
//        System.out.println(normalBinarySearch(nums, 5));
        System.out.println(nextGreatestLetter(letters, 'a'));
    }

    static int normalBinarySearch(int[] arr, int target) {
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

    // order-agnostic binary search
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(arr[end] > arr[start]) {
            return normalBinarySearch(arr, target);
        } else {
            while(start <= end) {
                int mid = start + (end - start)/2;

                if(arr[mid] > target) {
                    end = mid - 1;
                } else if(arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

    // 35. Search Insert Position
    static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] < target) {
                start = mid + 1;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return start;
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(letters[mid] < target) {
                start = mid + 1;
            } else if(letters[mid] > target) {cd
                end = mid - 1;
            } else {
                return letters[mid];
            }
        }

        return letters[start];
    }

}
