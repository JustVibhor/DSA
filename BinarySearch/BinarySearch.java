package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 9, 11, 12, 18, 22, 34};
        char[] letters = {'c', 'f', 'j'};
//        System.out.println(normalBinarySearch(nums, 5));
        System.out.println(nextGreatestLetter(letters, 'a'));
    }

    static int normalBinarySearch(int[] arr, int target, int start, int end) {


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

    private static int normalBinarySearch(int[] arr, int target) {
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
            } else if(letters[mid] > target) {
                end = mid - 1;
            } else {
                return letters[mid];
            }
        }

        return letters[start];
    }

    // 34. Find First and Last Position of Element in Sorted Array
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = binarySearchForSearchRange(nums, target, true);
        ans[1] = binarySearchForSearchRange(nums, target, false);


        return ans;
    }

    int binarySearchForSearchRange(int[] nums, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if(isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


    // position of an element in an infinite sorted array
    static int infiniteSortedArray(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while(nums[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return normalBinarySearch(nums, target, start, end);
    }

    // 852. Peak Index in a Mountain Array
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

}
