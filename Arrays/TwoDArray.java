package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(convert2Dto1D(matrix)));
    }

    static int[] searchIn2DArray(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if(matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] {-1, -1};
    }

    // Search in fully sorted 2d array
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        if(rows == 1) {
            return binarySearchIn2Darray(matrix, 0, 0, 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart)/2;

            if(matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            }
            if(matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

        if(matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart+1][cMid] == target) {
            return new int[]{rStart+1, cMid};
        }
        // 1st half
        if(matrix[rStart][cMid-1] >= target) {
            return binarySearchIn2Darray(matrix, rStart, 0, cMid-1, target);
        }
        // 2nd half
        if(matrix[rStart][cMid+1] <= target && target <= matrix[rStart+1][cMid-1]) {
            return binarySearchIn2Darray(matrix, rStart, cMid+1, cols-1, target);
        }
        // 3rd half
        if(target <= matrix[rStart+1][cMid-1]) {
            return binarySearchIn2Darray(matrix, rStart+1, 0, cMid-1, target);
        }
        // 4th half
        else {
            return binarySearchIn2Darray(matrix, rStart+1, cMid+1, cols-1, target);
        }
    }

    private static int[] binarySearchIn2Darray(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart)/2;

            if(matrix[row][cMid] == target) {
                return new int[]{row, cMid};
            }

            if(matrix[row][cMid] < target) {
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] convert2Dto1D(int[][] matrix) {
//        List<Integer> ans = new ArrayList<Integer>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                ans.add(matrix[i][j]);
//            }
//        }

        return Arrays.stream(matrix).flatMapToInt(IntStream::of).toArray();
    }
}
