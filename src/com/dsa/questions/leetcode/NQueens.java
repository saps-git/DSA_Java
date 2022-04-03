package com.dsa.questions.leetcode;

//Leetcode-51

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    static List<List<String>> sol = new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        if(n == 2 || n == 3) return sol;
        boolean[][] board = new boolean[n][n];
        nQueens(board, 0);
        return sol;
    }
    public static void nQueens(boolean[][] board, int row) {
        if(row == board.length) {
            addToList(board);
            return;
        }

        for(int col=0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                nQueens(board, row+1);
                board[row][col] = false;
            }
        }
    }
    public static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i=row-1;i>=0;i--){
            if(board[i][col]) return false;
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j]) return false;
        }

        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j]) return false;
        }

        return true;
    }
    public static void addToList(boolean[][] board) {
        List<String> ans = new ArrayList<>();
        for(boolean[] row: board) {
            String str = "";
            for(boolean element: row) {
                if(element) str = str+'Q';
                else str = str+'.';
            }
            ans.add(str);
        }
        sol.add(ans);
    }
}



