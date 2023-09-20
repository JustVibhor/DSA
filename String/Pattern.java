package String;

import java.util.Locale;

public class Pattern {
    public static void main(String[] args) {
//        System.out.println(palindrome("aabaA"));
        pattern5(5);
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
        for(int row=1; row<=n; row++) {
            for(int col=n-row; col>0; col--) {
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
