package StackAndQueue.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GameOfTwoStacks {

    public static void main(String[] args) {
        int[] heights = {
                2, 1, 5, 6, 2, 3
        };

            System.out.println(largestRectangleAreaStack(heights));

    }


    static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {

        return twoStacksHelper(maxSum, a, b, 0, 0);
    }

    private static int twoStacksHelper(int maxSum, List<Integer> a, List<Integer> b, int sum, int count) {
        if (sum > maxSum) {
            return count - 1;
        }


        int left = 0, right = 0;
        if (!a.isEmpty())
            left = twoStacksHelper(maxSum, a, b, sum + (a.removeFirst()), count + 1);

        if (!b.isEmpty())
            right = twoStacksHelper(maxSum, a, b, sum + (b.removeFirst()), count + 1);

        return Math.max(left, right);
    }

    public static int largestRectangleAreaStack(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = findLeft(heights, i);
            int right = findRight(heights, i);

            int area = (right - left + 1) * heights[i];

            if (maxArea < area) {
                maxArea = area;
            }
        }

        return maxArea;
    }

    private static int findLeft(int[] heights, int index) {
        while (index > 0) {

            if (heights[index - 1] < heights[index]) {
                return index;
            }
            index--;
        }

        return index;
    }

    private static int findRight(int[] heights, int index) {
        while (index < heights.length - 1) {
            if (heights[index] > heights[index + 1]) {
                return index;
            }
            index++;
        }

        return index;
    }


}
