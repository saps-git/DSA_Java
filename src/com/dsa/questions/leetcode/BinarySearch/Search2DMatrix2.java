package com.dsa.questions.leetcode.BinarySearch;

//Leetcode-240

//Row and col sorted
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.

public class Search2DMatrix2 {
    public static boolean searchMatrix(int[][] arr, int target){
        int row = 0, col = arr[0].length-1; //will start from last element of first row
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target) return true;
            else if(arr[row][col] > target) col--; //if the curr element is bigger than the target, that means every
                // element in the current col is also bigger than target, hence ignore the whole col
            else row++; //if the current element is smaller than the target, that means every element in the current row
                // is also smaller, hence ignore the whole row
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 51},
                {15, 25, 35, 45, 52},
                {28, 29, 37, 49, 53},
                {33, 34, 38, 50, 54}
        };

        System.out.println(searchMatrix(arr, 49));
    }
}
