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

    static int[] binarySearchIn2DArray(int[][] matrix, int target) {
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
