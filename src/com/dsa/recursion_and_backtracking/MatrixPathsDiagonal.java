package com.dsa.recursion_and_backtracking;

//Along with going right and down, you can now go diagonally as well

import java.util.ArrayList;
import java.util.List;

//Along with previous steps, we will decr both row and col by 1

public class MatrixPathsDiagonal {
    public static void main(String[] args) {
        int row = 3, col = 3;
        System.out.println(count(row, col));
        System.out.println(paths(row, col, ""));
    }
    public static int count(int row, int col) {
        if(row == 1 || col == 1) return 1;

        int diagonal = count(row-1, col-1);
        int right = count(row, col-1);
        int down = count(row-1, col);

        return right+down+diagonal;
    }
    public static List<String> paths(int row, int col, String ans) {
        if(row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        List<String> sol = new ArrayList<>();

        if(row > 1 && col > 1) {
            sol.addAll(paths(row-1, col-1, ans+'D')); //D - diagonal
        } if(row > 1) {
            sol.addAll(paths(row-1, col, ans+'V')); //V - vertical (down)
        } if(col > 1) {
            sol.addAll(paths(row, col-1, ans+'H')); //H - horizontal (right)
        }

        return sol;
    }
}
