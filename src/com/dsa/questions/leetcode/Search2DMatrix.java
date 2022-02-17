package com.dsa.questions.leetcode;

//Leetcode-74

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int m = matrix.length, n = matrix[0].length;
        int start = 0, end = m*n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) start = mid+1;
            else end = mid-1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(searchMatrix(nums, 9));
    }
}
