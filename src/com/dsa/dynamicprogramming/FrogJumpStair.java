package com.dsa.dynamicprogramming;

import java.util.Arrays;

public class FrogJumpStair {
    public static int frogJump(int[] height) {
        int n = height.length;
        if(n < 2) return 0;
//        return frogJumpRecr(height, n-1, 0);

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return frogJumpMemo(height, n-1, 0, dp);
    }

    public static int frogJumpRecr(int[] height, int n, int i) {
        if(i == n) return 0;

        int oneStep = Math.abs(height[i] - height[i+1]) + frogJumpRecr(height, n, i+1);
        int twoStep = Integer.MAX_VALUE;
        if(i<n-1) {
            twoStep = Math.abs(height[i] - height[i+2]) + frogJumpRecr(height, n, i+2);
        }
        return Math.min(oneStep, twoStep);
    }

    public static int frogJumpMemo(int[] height, int n, int i, int[] dp) {
        if(i == n) return 0;
        if(dp[i] != -1) return dp[i];

        int oneStep = Math.abs(height[i] - height[i+1]) + frogJumpMemo(height, n, i+1, dp);
        int twoStep = Integer.MAX_VALUE;
        if(i<n-1) {
            twoStep = Math.abs(height[i] - height[i+2]) + frogJumpMemo(height, n, i+2, dp);
        }

        return dp[i] = Math.min(oneStep, twoStep);
    }

    public static int frogJumpTabulation(int[] height) {
        int n = height.length;
        if(n < 2) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = Math.abs(height[1] - height[0]);
        for(int i=2;i<n;i++) {
            int oneStep =  dp[i-1] + Math.abs(height[i] - height[i-1]);
            int twoStep =  dp[i-2] + Math.abs(height[i] - height[i-2]);
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[n-1];
    }
    public static int frogJumpSpaceOpt(int[] height) {
        if(height.length < 2) return 0;

        int prev = 0, prev2 = 1, curr = 0;
        for(int i=2;i<height.length;i++) {
            int oneStep = prev + Math.abs(height[i] - height[i-1]);
            int twoStep =  prev2 + Math.abs(height[i] - height[i-2]);

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
