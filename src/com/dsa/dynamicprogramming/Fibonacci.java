package com.dsa.dynamicprogramming;

import java.util.Arrays;

public class Fibonacci {
    //Space - 2 * O(N)
    public static int fibonacciMemo(int n, int[] dp) {
        if(n <= 1) return n;

        if(dp[n] != -1) return dp[n];

        return dp[n] = fibonacciMemo(n-1, dp) + fibonacciMemo(n-2, dp);
    }

    //Space - O(N)
    public static int fibonacciTable(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    //Space - O(1)
    public static int fibonacci(int n) {
        if(n < 2) return n;

        int first = 0, second = 1;
        int curr = 0;
        for(int i=2;i<=n;i++) {
            curr = first + second;
            first = second;
            second = curr;
        }

        return curr;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibonacciMemo(n, dp));
        System.out.println(fibonacciTable(n));
        System.out.println(fibonacci(n));
    }
}
