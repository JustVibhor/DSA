package BitManipulation;

import java.util.Arrays;

public class Bits {
    public static void main(String[] args) {
        int[][] nums = {{1,1,0},{1,0,1},{0,0,0}};
//        int n = findNonRepeatingElement(nums);
        System.out.println(Arrays.deepToString(flippingAnImage(nums)));

    }

    private static int covertBinaryToDecimal(int n) {
        int ans = 0;
        int count = 0;
        while(n > 0) {
            ans += (int) ((n % 10)*Math.pow(2, count));
            count++;
            n /= 10;
        }
        return ans;
    }

    static String isEven(int n) {
        return (n&1) == 0 ? n + " is a even number" : n + " is an odd number";
    }

    static int whichElementRepeating(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    static int findIthBit(int n, int i) {

        return n | (1 << i-1);
    }

    static int resetIthBit(int n, int i) {
        return (n >> i) << i;
    }

    static int findRightMostSetBit(int n) {
//        if(n == 0) {
//            return -1;
//        }
//        int count = 1;
//        while(true) {
//            if((n & 1) == 1) {
//                return count;
//            }
//            n = n >> 1;
//            count++;
//        }
        return n & -n;
    }

    // Repetition is in odd
    static int findNonRepeatingElement(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            int n = covertDecimalToBinary(num);
            ans += n;
//            System.out.println(ans);
        }
//        return ans;

        int real_ans = 0;
        int count = 0;

        while(ans > 0) {
            real_ans += (int) (((ans%10)%3)*Math.pow(10, count));
            count++;
            ans /= 10;

        }
        return covertBinaryToDecimal(real_ans);
    }

    static int covertDecimalToBinary(int n) {
        int ans = 0;
        int count = 0;
        while(n > 0) {
            ans += (int) ((n % 2)*Math.pow(10, count));
            n /= 2;
            count++;
        }

        return ans;

    }

    // find the nth magic number
    static int nthMagicNumber(int n) {
        int ans = 0;
        int base = 1;

        while(n > 0) {
            ans += (n&1) * base;
            n = n >> 1;
            base *= 5;
        }

        return ans;
    }

    static int noOfDigitsInBaseb(int n, int base) {
        return (int)((Math.log(n) / Math.log(base)) + 1);
    }

    static int sumOfnthRowInPascalTriangle(int n) {
        return 1 << n-1;
    }

    static int factorial(int n) {
        if(n == 0) {
            return 1;
        }

        return n * factorial(n-1);
    }

    static void pascalTriangle(int n) {
        for (int i=0; i<n; i++) {
            int spaces = n - i - 1;
            for (int j=0; j<spaces; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {

                System.out.print((int)(factorial(i) / (factorial(i - j)*factorial(j))) + " ");
            }
            System.out.println();
        }
    }

    static boolean isPowerOf2(int n) {
//        while(n > 0 && (n&1) == 0) {
//                n = n >> 1;
//        }
//
//        return n == 1;
        return (n & (n-1)) == 0;
    }

    static int findPow(int base, int power) {
        int answer = 1;

        while(power > 0) {

            answer = (power&1) == 1 ? answer*base : answer;
            power >>= 1;
            base *= base;
        }

        return answer;
    }

    static int noOfSetBits(int n, String method) {
        int count = 0;
        switch (method) {
            case  "RightShift": {
                while(n > 0) {
                    count = (n & 1) == 1 ? count+1 : count;
                    n >>= 1;
                }
                return count;
            }

            case "BitSubtraction": {
                while (n > 0) {
                    n -= (n & -n);
                    count++;
                }
                return count;
            }

            case "And": {
                while(n > 0) {
                    n &= n-1;
                    count++;
                }
                return count;
            }
        }

        return -1;

    }

    static int xorOf0Ton(int n) {
        if(n % 4 == 0) {
            return n;
        }
        if(n % 4 == 1) {
            return 1;
        }

        if(n % 4 == 2) {
            return n+1;
        }

        if(n % 4 == 3) {
            return 0;
        }

        return -1;
    }

    static int xorFromAtoB(int a, int b) {
        return xorOf0Ton(b) ^ xorOf0Ton(a - 1);
    }

    static int[][] flippingAnImage(int[][] image) {

        for(int[] row: image) {

            // horizontal swapping
            for(int i=0; i<(row.length + 1)/2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }

        }

        return image;
    }
}
