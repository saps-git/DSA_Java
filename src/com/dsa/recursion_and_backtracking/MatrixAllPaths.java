package com.dsa.recursion_and_backtracking;
//Backtracking - make a change, but while recursion call is over, remove that change

//You can move in all four directions

import java.util.Arrays;

public class MatrixAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allPaths("", maze, 0, 0);

        //Printing all the possible paths
        //allPathPrint("", maze, 0, 0, new int[maze.length][maze[0].length], 1);
    }
    public static void allPaths(String ans, boolean[][] maze, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(ans);
            return;
        }

        if(!maze[row][col]) return;

        maze[row][col] = false; //turning all the cells visited as false, so we don't choose same path again,
        //causing stack overflow

        if(row < maze.length-1) {
            allPaths(ans+'D', maze, row+1, col);
        } if(col < maze[0].length-1) {
            allPaths(ans+'R', maze, row, col+1);
        } if(row > 0) {
            allPaths(ans+'U', maze, row-1, col);
        } if(col > 0) {
            allPaths(ans+'L', maze, row, col-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        // because the changes made are to the main maze, hence not to cause any effects for other function calls
        maze[row][col] = true;
    }

    //path will be the maze for final soln, and step will be to trace the path
    /*static void allPathPrint(String ans, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            allPathPrint(ans + 'D', maze, row+1, col, path, step+1);
        }

        if (col < maze[0].length - 1) {
            allPathPrint(ans + 'R', maze, row, col+1, path, step+1);
        }

        if (row > 0) {
            allPathPrint(ans + 'U', maze, row-1, col, path, step+1);
        }

        if (col > 0) {
            allPathPrint(ans + 'L', maze, row, col-1, path, step+1);
        }

        maze[row][col] = true;
        path[row][col] = 0; //before returning turn the step or that cell back to 0, so other calls can also
        //trace this path in other ways
    }*/
}
