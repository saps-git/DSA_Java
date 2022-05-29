package com.dsa.questions.leetcode.Arrays;

//Leetcode-53
//Following Kadane's algorithm

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i: nums) {
            currSum = Math.max(i, currSum+i);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
