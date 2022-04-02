package com.dsa.recursion_and_backtracking;

//Count and Print all the possible paths from (0,0) to (row,col) of a matrix. You can only go right and down

import java.util.ArrayList;
import java.util.List;

//Since we can go only down and right, hence we will make two recursive calls
//one in which we reduce the row, and one in which we reduce the col
//when either of them becomes one, that means we are in the last row, or col respectively,
// hence we return 1, as we know it is a valid path now because it will straight up lead to (row, col).
//On backtracking we will add the return values from both the recursive calls and return the answer
public class MatrixPaths {
    public static void main(String[] args) {
        int row = 3, col = 3;
        System.out.println(count(row, col));
        System.out.println(paths(row, col, ""));
    }
    public static int count(int row, int col) {
        if(row == 1 || col == 1) return 1;

        int down = count(row-1, col);
        int right = count(row, col-1);
        return down+right;
    }
    //returning a list of paths
    public static List<String> paths(int row, int col, String ans) {
        if(row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        List<String> sol = new ArrayList<>();

        if(row > 1) {
            sol.addAll(paths(row-1, col, ans+'D'));
        } if(col > 1) {
            sol.addAll(paths(row, col-1, ans+'R'));
        }
        return sol;
    }
}
