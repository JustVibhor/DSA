package Recursion;

// As u have seen how inefficient these recursive programs are
// why even bother with them?
// So the complexity issue will be solved by dynamic programming. Period


public class RecursionExamples {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(binarySearchRecursion(nums, 0, nums.length-1, 10));

    }

    static void numberRec(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        numberRec(n-1);
    }

    static int findNthFibonacci(int n) {
        if(n < 2) {
            return n;
        }

        return findNthFibonacci(n-1) + findNthFibonacci(n-2);
    }

    static int binarySearchRecursion(int[] nums, int start, int end, int target) {

        if(start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if(nums[mid] == target) {
            return mid;
        }

        if(nums[mid] > target) {
            return binarySearchRecursion(nums, 0, mid-1, target);
        }
        return binarySearchRecursion(nums, mid+1, end, target);
    }
}
