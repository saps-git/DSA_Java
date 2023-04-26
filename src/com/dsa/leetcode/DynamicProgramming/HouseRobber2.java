package com.dsa.leetcode.DynamicProgramming;

//Leetcode-213

import java.util.Arrays;

public class HouseRobber2 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int[] arr1 = Arrays.copyOfRange(nums, 0, n-1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, n);
        return Math.max(robHelper(arr1), robHelper(arr2));
    }
    public static int robHelper(int[] nums) {
        int prev = nums[0], prev2 = Math.max(nums[0], nums[1]);
        int curr = prev2;
        for(int i=2;i<nums.length;i++) {
            curr = Math.max(nums[i] + prev, prev2);
            prev = prev2;
            prev2 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(rob(nums));
    }
}
