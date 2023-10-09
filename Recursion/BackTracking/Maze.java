package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        List<String> list = mazeAllDirectionMoreInfo(maze, 0, 0, "", new int[3][3], 1);
        System.out.println(list);
    }

    static List<String> maze(boolean[][] maze, int row, int col, String p) {
        List<String> list = new ArrayList<>();
        if (row == maze.length - 1 && col == maze.length - 1) {
            list.add(p);
            return list;
        }


        if (!maze[row][col] && row < maze.length - 1 && col < maze[0].length - 1) {
            list.addAll(maze(maze, row + 1, col + 1, p + "G"));
        }

        if (!maze[row][col] && row < maze.length - 1) {

            list.addAll(maze(maze, row + 1, col, p + "D"));
        }

        if (!maze[row][col] && col < maze[0].length - 1) {

            list.addAll(maze(maze, row, col + 1, p + "R"));
        }

        return list;

    }

    static List<String> mazeAllDirection(boolean[][] visited, int row, int col, String p) {
        List<String> list = new ArrayList<>();
        if (row == visited.length - 1 && col == visited.length - 1) {
            list.add(p);

            return list;
        }


        if (!visited[row][col]) {
            visited[row][col] = true;

            if (row > 0) {
                list.addAll(mazeAllDirection(visited, row - 1, col, p + "U"));
            }

            if (col > 0) {
                list.addAll(mazeAllDirection(visited, row, col - 1, p + "L"));
            }

            if (row < visited.length - 1) {
                list.addAll(mazeAllDirection(visited, row + 1, col, p + "D"));
            }

            if (col < visited[0].length - 1) {
                list.addAll(mazeAllDirection(visited, row, col + 1, p + "R"));
            }

            // WHILE COMING BACK RESTORE IT TO DEFAULT
            visited[row][col] = false;
        }


        return list;

    }


    static List<String> mazeAllDirectionMoreInfo(boolean[][] visited, int row, int col, String p, int[][] visual, int count) {
        List<String> list = new ArrayList<>();
        if (row == visited.length - 1 && col == visited.length - 1) {
            for(int[] arr: visual) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            list.add(p);
            return list;
        }


        if (!visited[row][col]) {
            visited[row][col] = true;
            visual[row][col] = count;

            if (row > 0) {
                list.addAll(mazeAllDirectionMoreInfo(visited, row - 1, col, p + "U", visual, count + 1));
            }

            if (col > 0) {
                list.addAll(mazeAllDirectionMoreInfo(visited, row, col - 1, p + "L", visual, count + 1));
            }

            if (row < visited.length - 1) {
                list.addAll(mazeAllDirectionMoreInfo(visited, row + 1, col, p + "D", visual, count + 1));
            }

            if (col < visited[0].length - 1) {
                list.addAll(mazeAllDirectionMoreInfo(visited, row, col + 1, p + "R", visual, count + 1));
            }

            visual[row][col] = 0;
            // WHILE COMING BACK RESTORE IT TO DEFAULT
            visited[row][col] = false;
        }


        return list;

    }

}
