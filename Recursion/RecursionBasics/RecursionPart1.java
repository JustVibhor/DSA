package Recursion.RecursionBasics;

public class RecursionPart1 {
    public static void main(String[] args) {
        System.out.println(countNumberOfZeros(30204));
    }

    static void printnTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnTo1(n - 1);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    static int reverseNumber(int n) {
        int base = (int) Math.log10(n) + 1;

        return helper(n, base);
    }


    static boolean palindrome(int n) {
//
//        int start = 1;
//        int end = (int)Math.log10(n) + 1;
//
//        while (start < end) {
//            if(n%10 != (n/(int)Math.pow(10, end-start))%10) {
//                return false;
//            }
//            n /= 10;
//            start++;
//            end--;
//        }
//        return true;

        return n == reverseNumber(n);

    }

    static int countNumberOfZeros(int n) {
        return countHelper(n, 0);

    }

    static int numberOfSteps(int n) {
        int count = 0;
        return stepsHelper(n, count);
    }

    private static int stepsHelper(int n, int count) {
        if (n == 0) {
            return count;
        }

        return n % 2 == 0 ? stepsHelper(n / 2, count + 1) : stepsHelper(n - 1, count + 1);
    }

    private static int countHelper(int n, int count) {
        if (n % 10 == n) {
            return count;
        }

        return n % 10 == 0 ? countHelper(n / 10, count + 1) : countHelper(n / 10, count);
    }


    private static int helper(int n, int base) {
        if (n % 10 == n) {
            return n;
        }

        return (int) ((n % 10) * Math.pow(10, base - 1) + helper(n / 10, base - 1));
    }
}
