package com.dsa.leetcode.DynamicProgramming;

//Leetcode-70

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n < 2) return 1;

        int prev = 1, prev2 = 1;
        int curr = 0;
        for(int i=2;i<=n;i++) {
            curr = prev + prev2;
            prev = prev2;
            prev2 = curr;
        }

        return curr;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
