package com.dsa.dynamicprogramming;

public class zero_one_Knapsack {
//    static int ans = 0;
//    public static int knapsack(int n, int w, int[] values, int[] weight) {
//        helper(n, w, values, weight, 0, 0);
//        return ans;
//    }
//    public static void helper(int n, int w, int[] values, int[] weight, int i, int curr) {
//        if(w == 0 || i == weight.length) {
//            ans = Math.max(ans, curr);
//            return;
//        }
//        if(w < 0) return;
//
//        if(weight[i] <= w) {
//            curr += values[i];
//            helper(n, w-weight[i], values, weight, i+1, curr);
//            curr -= values[i];
//        }
//        helper(n, w, values, weight, i+1, curr);
//    }
    public static int knapsack(int n, int w, int[] values, int[] weight){
        if(n==0 || w==0) return 0;

        if(weight[n-1] <= w) {
            return Integer.max(values[n-1] + knapsack(n-1, w-weight[n-1], values, weight), knapsack(n-1, w, values, weight));
        } else {
            return knapsack(n-1, w, values, weight);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int w = 5;
        int[] values = {5,4,8,6};
        int[] weight = {1,2,4,5};
        System.out.println(knapsack(n, w, values, weight));
    }
}
