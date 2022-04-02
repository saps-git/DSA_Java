package com.dsa.recursion_and_backtracking;

public class MatrixWithObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        paths(maze, "", 0, 0);
    }
    public static void paths(boolean[][] maze, String ans, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(ans);
            return;
        }

        if(!maze[row][col]) return;

        if(row < maze.length-1) paths(maze, ans+'D', row+1, col);
        if(col < maze[0].length-1) paths(maze, ans+'R', row, col+1);
    }
}
