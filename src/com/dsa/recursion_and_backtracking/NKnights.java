package com.dsa.recursion_and_backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board = new boolean[n][n];
        nKnights(board, 0, 0, n);
    }
    public static void nKnights(boolean[][] board, int row, int col, int knights) {
        if(knights == 0) { //placed all the knights
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board.length) return; //i.e reached the last cell
        if(col == board.length) { //if one column is filled, move to the next row
            nKnights(board, row+1, 0, knights);
            return;
        }

        if(isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col+1, knights-1); //since more than one knights can be placed in same row
            //hence, we check the whole row first for possible free cells to place the knight
            board[row][col] = false; //while backtracking make it false
        }
        nKnights(board, row, col+1, knights); //even if the current cell, is not empty to place the knight, check
        //in the same row, hence col+1
    }
    public static boolean isSafe(boolean[][] board, int row, int col) {
        //checking for all possible moves for a knight
        if(isValid(board, row-1, col-2)) { //pre-check so that we don't get index out of bound
            if (board[row-1][col-2]) return false;
        }
        if(isValid(board, row-1, col+2)) {
            if (board[row-1][col+2]) return false;
        }
        if(isValid(board, row-2, col-1)) {
            if (board[row-2][col-1]) return false;
        }
        if(isValid(board, row-2, col+1)) {
            if (board[row-2][col+1]) return false;
        }
        return true;
    }
    //since it is used to check, for every condition, hence we make one separate function for it
    public static boolean isValid(boolean[][] board, int row, int col) { //pre-check so that we don't get index out of bound
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) return true;
        else return false;
    }
    public static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean element: row) {
                if(element) System.out.print("K ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }

}
