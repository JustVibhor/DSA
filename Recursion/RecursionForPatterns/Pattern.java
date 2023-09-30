package Recursion.RecursionForPatterns;

public class Pattern {
    public static void main(String[] args) {
        normalTriangle(3, 0);
    }

    static void reverseRightTriangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (r > c) {
            System.out.print("* ");
            reverseRightTriangle(r, c + 1);
        } else {
            System.out.println();
            reverseRightTriangle(r - 1, 0);
        }
    }

    static void normalTriangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (r > c) {
            normalTriangle(r, c + 1);
            System.out.print("* ");
        } else {
            normalTriangle(r - 1, 0);
            System.out.println();
        }
    }

}
