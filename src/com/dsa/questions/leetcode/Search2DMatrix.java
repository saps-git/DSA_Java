package com.dsa.questions.leetcode;

//Leetcode-74

//Strictly sorted Matrix
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        //Think this 2D matrix, as an simple array, and perform binary search on it
        int m = matrix.length, n = matrix[0].length;
        int start = 0, end = m*n-1; //start and end elements

        while(start <= end){
            int mid = start + (end-start)/2;
            int row = mid/n; //converting the mid it's to row & col in matrix, to find the mid element in matrix
            int col = mid%n;

            //steps same as binary search
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) start = mid+1;
            else end = mid-1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(searchMatrix(nums, 9));
    }
}
