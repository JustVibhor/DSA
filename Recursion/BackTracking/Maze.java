package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        List<String> list = mazeAllDirection(maze, 0, 0, "");
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

    static List<String> mazeAllDirection(boolean[][] maze, int row, int col, String p) {
        List<String> list = new ArrayList<>();
        if (row == maze.length - 1 && col == maze.length - 1) {
            list.add(p);

            return list;
        }


        if (!maze[row][col] && row > 0) {
            maze[row][col] = true;
            list.addAll(mazeAllDirection(maze, row - 1, col, p + "U"));
            maze[row][col] = false;
        }

        if (!maze[row][col] && col > 0) {
            maze[row][col] = true;
            list.addAll(mazeAllDirection(maze, row, col - 1, p + "L"));
            maze[row][col] = false;
        }

        if (!maze[row][col] && row < maze.length - 1) {
            maze[row][col] = true;
            list.addAll(mazeAllDirection(maze, row + 1, col, p + "D"));
            maze[row][col] = false;
        }

        if (!maze[row][col] && col < maze[0].length - 1) {
            maze[row][col] = true;
            list.addAll(mazeAllDirection(maze, row, col + 1, p + "R"));
            maze[row][col] = false;
        }

        return list;

    }
}
