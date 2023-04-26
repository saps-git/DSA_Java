package com.dsa.leetcode.DynamicProgramming;

//Leetcode-198

import java.util.Arrays;

public class HouseRobber {
    public static int rob(int[] nums) {
//        return robRecr(nums, 0);
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return Math.max(robMemo(nums, 0, dp), robMemo(nums, 1, dp));
    }
    public static int robRecr(int[] nums, int i) {
        if(i == nums.length-1) return nums[i];
        if(i == nums.length) return 0;

        return Math.max(nums[i] + robRecr(nums, i+2), robRecr(nums, i+1));
    }
    public static int robMemo(int[] nums, int i, int[] dp) {
        if(i == nums.length-1) return nums[i];
        if(i == nums.length) return 0;
        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max(nums[i] + robMemo(nums, i+2, dp), robMemo(nums, i+1, dp));
    }
    public static int robTable(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<n;i++) {
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
    public static int robSpaceOpt(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int prev = nums[0], prev2 = Math.max(nums[0], nums[1]);
        int curr = prev2;
        for(int i=2;i<n;i++) {
            curr = Math.max(nums[i] + prev, prev2);
            prev = prev2;
            prev2 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,6};
        System.out.println(rob(nums));
        System.out.println(robTable(nums));
        System.out.println(robSpaceOpt(nums));
    }
}
