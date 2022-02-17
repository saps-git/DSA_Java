package com.dsa.questions.leetcode;

//Leetcode-240

public class Search2DMatrix2 {
    public static boolean searchMatrix(int[][] arr, int target){
        int row = 0, col = arr[0].length-1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target) return true;
            else if(arr[row][col] > target) col--;
            else row++;
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
