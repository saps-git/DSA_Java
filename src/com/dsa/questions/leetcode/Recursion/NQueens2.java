package com.dsa.questions.leetcode.Recursion;

//Leetcode-52

public class NQueens2 {
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
    public static int totalNQueens(int n) {
        if(n==1) return 1;
        if(n == 2 || n == 3) return 0;
        boolean[][] board = new boolean[n][n];
       return nQueens(board, 0);
    }
    public static int nQueens(boolean[][] board, int row) {
        if(row == board.length) {
            return 1;
        }

        int count = 0;
        for(int col=0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
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
}
