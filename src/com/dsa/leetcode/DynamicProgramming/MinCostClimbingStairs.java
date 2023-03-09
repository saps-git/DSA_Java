package com.dsa.leetcode.DynamicProgramming;

//Leetcode-746

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        //return Math.min(minCost(0, cost), minCost(1, cost));
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        return Math.min(minCostMemo(0, cost, dp), minCostMemo(1, cost, dp));
    }
    public static int minCost(int i, int[] cost) {
        if(i >= cost.length) return 0;

        return cost[i] + Math.min(minCost(i+1, cost), minCost(i+2, cost));
    }
    public static int minCostMemo(int i, int[] cost, int[] dp) {
        if(i >= cost.length) return 0;
        if(dp[i] != -1) return dp[i];

        return dp[i] = cost[i] + Math.min(minCostMemo(i+1, cost, dp), minCostMemo(i+2, cost, dp));
    }
    public static int minCostTable(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = cost[0]; dp[1] = cost[1];
        for(int i=2;i<n;i++) {
            dp[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);
    }
    public static int minCostSpaceOpt(int[] cost) {
        int n = cost.length;
        int one = cost[0], two = cost[1];
        for(int i=2;i<n;i++) {
            int curr = cost[i] + Math.min(one, two);
            one = two;
            two = curr;
        }

        return Math.min(one, two);
    }
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
        System.out.println(minCostTable(cost));
        System.out.println(minCostSpaceOpt(cost));
    }
}
