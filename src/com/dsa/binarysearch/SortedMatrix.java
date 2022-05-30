package com.dsa.binarysearch;

import java.util.Arrays;

//These two conditions guarantees that if you connect all rows together, it is still sorted.
// So this question is just a regular binary search. Do NOT think it as an M row N column 2D matrix,
// it is just a 1D Sorted list the length is M * N.
//
//        Integers in each row are sorted from left to right.
//        The first integer of each row is greater than the last integer of the previous row.
//        The only trick is : if you have a number x in (0, M * N -1), how to change from x to row and column number.
//
//        row = x / N
//        column = x % N.

public class SortedMatrix {
    public static int[] search(int[][] nums, int target){
        int m = nums.length, n = nums[0].length;
        int start = 0, end = m*n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int row = mid/n;
            int col = mid%n;

            if(nums[row][col] == target) return new int[]{row, col};
            else if(nums[row][col] > target) end = mid-1;
            else start = mid+1;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(nums, 9)));
    }
}
