package com.dsa.recursion_and_backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueens(board, 0);
    }
    public static void nQueens(boolean[][] board, int row) {
        if(row == board.length) { //it means we have placed all the queens, that's why we are at the last row
            display(board); //calling the display function
            System.out.println();
            return; //to look for other possible answers
        }

        for(int col=0; col<board.length; col++) {
            if(isSafe(board, row, col)) { //will check if it is safe to place it at this cell
                board[row][col] = true; //mark it true, for checking isSafe of subsequent calls
                nQueens(board, row+1); //check for the rows beneath it, will incr row only, as we can't place
                //multiple queens in same row
                board[row][col] = false; //while backtracking setting the cell as false, as queen can't be placed in the
                //subsequent rows, which indirectly means queen can't be placed in this cell also
            }
        }
    }
    public static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for(int i=row-1;i>=0;i--){
            if(board[i][col]) return false;
        }

        // diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j]) return false;
        }

        // diagonal right
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j]) return false;
        }

        return true;
    }
    public static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean element: row) {
                if(element) System.out.print('Q');
                else System.out.print('.');
            }
            System.out.println();
        }
    }
}
