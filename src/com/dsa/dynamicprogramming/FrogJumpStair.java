package com.dsa.dynamicprogramming;

import java.util.Arrays;

public class FrogJumpStair {
    public static int frogJump(int[] height) {
        int n = height.length;
        if(n < 2) return 0;
//        return frogJumpHelper(n-1, height);
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return frogJumpMemo(n-1, height, dp);
    }
    public static int frogJumpHelper(int n, int[] height) {
        if(n == 0) return 0;

        int oneStep = frogJumpHelper(n-1, height) + Math.abs(height[n] - height[n-1]);
        int twoStep = Integer.MAX_VALUE;
        if(n > 1) {
            twoStep = frogJumpHelper(n - 2, height) + Math.abs(height[n] - height[n - 2]);
        }

        return Math.min(oneStep, twoStep);
    }
    public static int frogJumpMemo(int n, int[] height, int[] dp) {
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];

        int oneStep = frogJumpMemo(n-1, height, dp) + Math.abs(height[n] - height[n-1]);
        int twoStep = Integer.MAX_VALUE;
        if(n > 1) {
            twoStep = frogJumpMemo(n - 2, height, dp) + Math.abs(height[n] - height[n - 2]);
        }

        return dp[n] = Math.min(oneStep, twoStep);
    }
    public static int frogJumpTabulation(int[] height) {
        int n = height.length;
        if(n < 2) return 0;
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++) {
            int oneStep = dp[i-1] + Math.abs(height[i] - height[i-1]);
            int twoStep = Integer.MAX_VALUE;
            if(i > 1) {
                twoStep =  dp[i-2] + Math.abs(height[i] - height[i-2]);
            }
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[n-1];
    }
    public static int frogJumpSpaceOpt(int[] height) {
        if(height.length < 2) return 0;

        int prev = 0, prev2 = 0, curr = 0;
        for(int i=1;i<height.length;i++) {
            int oneStep = prev + Math.abs(height[i] - height[i-1]);
            int twoStep = Integer.MAX_VALUE;
            if(i > 1) {
                twoStep =  prev2 + Math.abs(height[i] - height[i-2]);
            }

            curr = Math.min(oneStep, twoStep);
            prev = prev2;
            prev2 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int[] height = {10,20,30,10};
        System.out.println(frogJump(height));
        System.out.println(frogJumpTabulation(height));
        System.out.println(frogJumpSpaceOpt(height));
    }
}

