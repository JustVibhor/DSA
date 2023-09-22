package Recursion;

public class RecursionExamples {
    public static void main(String[] args) {
        int n = findNthFibonacci(7);
        System.out.println(n);
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
}
