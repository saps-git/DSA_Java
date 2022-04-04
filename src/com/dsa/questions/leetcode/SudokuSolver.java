package com.dsa.questions.leetcode;

//leetcode-37

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        sudoku(board);
        for(char[] row: board) {
            for(char element: row) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
    public static boolean sudoku(char[][] board) {
        for(int row=0;row<9;row++) { //looping across the matrix
            for(int col=0;col<9;col++) {
                if(board[row][col] == '.') { //till we find the empty space
                    for(char c='1';c<='9';c++) { //in this we will try to put every number and check
                        if(isValid(board, row, col, c)) { // if it is valid
                            board[row][col] = c; //then put that number
                            if(sudoku(board)) return true; //and continue to solve, if it returns true, that means,
                                // all the other calls after this were able to successfully put numbers at right places
                                // and hence then true will be returned from main function call, meaning sudoku solved
                                //BUT, if at any point any call couldn't put any number at the empty place, it means,
                                //we need to backtrack to the previous call and try another number do the same for
                                //calls before it too, if needed.
                            else board[row][col] = '.'; //But before going back marking that cell as empty again, BACKTRACKING
                        }
                    }
                    return false; //if couldn't place any number in that empty space, return false
                }
            }
        }
        return true; //if couldn't find any empty space, it means we have filled the whole board, solved, so return true.
    }
    public static boolean isValid(char[][] board, int row, int col, char c) {
        //checking rows and cols
        for(int i=0;i<9;i++) {
            if(board[row][i] == c) return false;
            if(board[i][col] == c) return false;
        }

        //for future SAPTARSHI: take a pen and paper and trace the findBox, you'll understand, we're actually returning
        //the border for row and col
        int[] rowBorder = findBox(row);
        int[] colBorder = findBox(col);

        for(int i=rowBorder[0];i<=rowBorder[1];i++) {
            for(int j=colBorder[0];j<=colBorder[1];j++) {
                if(board[i][j] == c) return false;
            }
        }
        return true;
    }
    public static int[] findBox(int pos) {
        int[] ans = new int[2];
        if(pos < 3) {
            ans[1] = 2;
        } else if(pos < 6) {
            ans[0] = 3;
            ans[1] = 5;
        } else if(pos < 9) {
            ans[0] = 6;
            ans[1] = 8;
        }
        return ans;
    }
}
