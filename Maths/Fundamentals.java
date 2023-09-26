package Maths;

import java.util.Arrays;

public class Fundamentals {
    public static void main(String[] args) {
//        sieve(20, new boolean[21]);
        System.out.println(findSqrt(36));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return true;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;

        }
        return true;
    }

    static void sieve(int n, boolean[] isChecked) {

        for (int i = 2; i * i <= n; i++) {
            if (!isChecked[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    isChecked[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!isChecked[i]) {
                System.out.println(i);
            }
        }
    }

    static int findSqrt(int n) {
//        for (int i=2; i*i <= n; i++) {
//            System.out.println(i);
//            if(i*i == n) {
//                return i;
//            }
//        }
//        return -1;

        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}