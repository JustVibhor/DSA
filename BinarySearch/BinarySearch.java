package BinarySearch;

import static java.util.Arrays.binarySearch;

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


    // 1095. Find in Mountain Array
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeak(mountainArr);
//
//        int ascSearch = binarySearch(mountainArr, target, 0, peak, true);
//
//        if(ascSearch != -1) {
//            return ascSearch;
//        }
//
//        return binarySearch(mountainArr, target, peak, mountainArr.length()-1, false);
//    }

//    int findPeak(MountainArray mountainArr) {
//        int start = 0;
//        int end = mountainArr.length() - 1;
//
//        while(start < end) {
//            int mid = start + (end - start) / 2;
//
//            if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
//                end = mid;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        return start;
//    }

//    int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAsc) {
//
//        while(start <= end) {
//            int mid = start + (end - start)/2;
//
//            if(mountainArr.get(mid) == target) {
//                return mid;
//            }
//
//            if(isAsc) {
//
//                if(mountainArr.get(mid) < target) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            } else {
//                if(mountainArr.get(mid) > target) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//
//        return -1;
//    }

    // end of ques find in mountail array



    //33. Search in Rotated Sorted Array
    public boolean searchforBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = peakElement(nums);
        if(peak == -1) {
            return binarySearch(nums, start, end, target);
        }

        if(nums[peak] == target) {
            return true;
        }

        if(target>=nums[start]) {
            return binarySearch(nums, start, peak-1, target);
        }


        return binarySearch(nums, peak+1, end, target);
    }


    int peakElement(int[] arr) {


        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    // Search in 2d Array
    // TC: O(N)
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            }

            if(target > matrix[row][col])
                row++;
            else
                col--;
        }

        return false;
    }

    // 33. Search in Rotated Sorted Array
    public boolean searchInRotatedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = findPeakInRotatedArray(nums, start, end);
        System.out.println(peak);
        if(peak == -1) {
            return binarySearch(nums, start, end, target);
        }

        if(nums[peak] == target) {
            return true;
        }

        if(nums[start] <= target) {
            return binarySearch(nums, start, peak-1, target);
        }


        return binarySearch(nums, peak+1, end, target);
    }

    int findPeakInRotatedArray(int[] nums, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if(mid>start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if(nums[start] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // 81. Search in Rotated Sorted Array II
    // best solution
    boolean searchForRotatedBS(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return true;

            if (nums[low] == nums[mid]) {
                low++;
                continue;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }


    // 81. Search in Rotated Sorted Array II
    boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int pivot = findPivot(nums);

        if (pivot == -1 || nums.length <= 1) {
            return binarySearch(nums, start, end, target);
        }

        if (nums[pivot] == target) {
            return true;
        }

        if (nums[start] <= target && nums[pivot] >= target) {
            return binarySearch(nums, start, pivot - 1, target);
        }

        return binarySearch(nums, pivot + 1, end, target);
    }

    boolean binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}