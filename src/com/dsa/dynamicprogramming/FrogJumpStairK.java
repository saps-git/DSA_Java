package com.dsa.dynamicprogramming;

import java.util.Arrays;

public class FrogJumpStairK {
    public static int frogJump(int[] height, int n, int k, int i) {
        if(i == n) return 0;

        int minSteps = Integer.MAX_VALUE;
        for(int j=1;j<=k;j++) {
            if(i < n-(j-1)) {
                int jump = Math.abs(height[i] - height[i+j]) + frogJump(height, n, k, i+j);
                minSteps = Math.min(minSteps, jump);
            }
        }
        return minSteps;
    }
    public static int frogJumpMemo(int[] height, int n, int k, int i, int[] dp) {
        if(i == n) return 0;
        if(dp[i] != -1) return dp[i];

        int minSteps = Integer.MAX_VALUE;
        for(int j=1;j<=k;j++) {
            if(i < n-(j-1)) {
                int jump = Math.abs(height[i] - height[i+j]) + frogJumpMemo(height, n, k, i+j, dp);
                minSteps = Math.min(minSteps, jump);
                dp[i] = minSteps;
            }
        }
        return minSteps;
    }
    public static int frogJumpTable(int[] height, int n, int k) {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(height[1] - height[0]);
        for(int i=2;i<n;i++) {
            int minSteps = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++) {
                if(i-j > 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    minSteps = Math.min(jump, minSteps);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int n = 5, k = 3;
        int[] height = {10, 30, 40, 50, 20};
        System.out.println(frogJump(height, n-1, k, 0));

        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(frogJumpMemo(height, n-1, k, 0, dp));

        System.out.println(frogJumpTable(height, n, k));
    }
}
