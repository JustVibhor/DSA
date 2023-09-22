package String;

import java.util.Locale;

public class Pattern {
    public static void main(String[] args) {
//        System.out.println(palindrome("aabaA"));
        pattern8(4);
    }

    // Palindrome
    public static boolean palindrome(String str) {
//        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start != end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    //   *
//   *  *
//   *  *  *
//   *  *  *  *
//   *  *  *  *  *
    static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    //      *  *  *  *  *
//      *  *  *  *
//      *  *  *
//      *  *
//      *
    static void pattern2(int n) {
        for(int i=0; i<n; i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // 1
// 1  2
// 1  2  3
// 1  2  3  4
// 1  2  3  4  5
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for(int row=0; row<2*n; row++) {
            int totalColumns = row > n ? 2*n - row : row ;

            for(int col=0; col<totalColumns; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    static void pattern5(int n) {
        for(int row=0; row<2*n; row++) {

            int totalColumns = row > n ? 2*n - row : row ;

            int noOfSpaces = n - totalColumns;
            for(int col=0; col<noOfSpaces; col++) {
                System.out.print(" ");
            }

            for(int col=0; col<totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for(int row=1; row<=n; row++) {
            int noOfSpaces = n - row;

            for(int col=1; col<=noOfSpaces; col++) {
                System.out.print(" ");
            }

            int totalCols = 2*row - 1;
            for(int col=1; col<=totalCols; col++) {
                int num = row > col ? (row - col) : -1 * (row - col);
                System.out.print(num+1);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for(int row=0; row<2*n; row++) {

            int totalCols = row > n ? 2*n - row : row;

            int noOfSpaces = n - totalCols;

            for(int col=1; col<=noOfSpaces; col++) {
                System.out.print(" ");
            }

            for(int col=totalCols; col>0; col--){
                System.out.print(col);
            }
            for(int col=2; col<=totalCols; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }

    static void pattern8(int n) {
        for(int row=0; row<2*n; row++) {
            for(int col=0; col<2*n; col++) {
                int c = Math.max(row, Math.max(col, Math.max(2*n-row-1, 2*n-col-1))) - n+1;
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}