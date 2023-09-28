package Maths;

import java.util.Arrays;

public class Fundamentals {
    public static void main(String[] args) {
        System.out.println(lcm(4, 8));
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

    static double findSqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
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
        root = (double) end;
        System.out.println(root);
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }

    static double newtonRaphsonSQRT(int n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + n / x);
            if (Math.abs(root - x) < 0.1) {
                break;
            }
            x = root;
        }
        return root;
    }

    static void factors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + "    ");
                } else
                    System.out.println(i + "    " + n / i);
            }
        }
    }

    static boolean dieHard(int a, int b, int c) {

        if (a + b < c) {
            return false;
        }

        if (a == c || b == c || a + b == c) {
            return false;
        }

        return c % gcd(a, b) == 0;
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}