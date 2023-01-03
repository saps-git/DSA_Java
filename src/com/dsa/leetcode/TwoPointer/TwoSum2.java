package com.dsa.leetcode.TwoPointer;

//Leetcode-167

import java.util.Arrays;

//Array of integers numbers that is already sorted in non-decreasing order,
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//Using no extra space

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j) {
            int sum = numbers[i] + numbers[j];
            if(sum == target) {
                return new int[]{i+1, j+1};
            }
            else if(sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
